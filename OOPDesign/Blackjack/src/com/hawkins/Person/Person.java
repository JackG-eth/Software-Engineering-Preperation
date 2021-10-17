package com.hawkins.Person;

import com.hawkins.card_deck.Deck;
import com.hawkins.card_deck.Hand;

import java.util.Scanner;

public class Person {

    private Hand hand;
    private Deck deck;

    public Person(Hand hand,Deck deck) {
        this.hand = hand;
        this.deck = deck;
    }

    public void clearHand(){
        hand.clearHand();
        hand.setScore(0);
        hand.setAces(0);
    }

    public int getScore(){
        return hand.getScore();
    }


    public void hit(){
        hand.addCard(deck.Deal());

        if(hand.getScore() > 21){
            if(hand.getAces() > 0){
                hand.adjust_for_ace();
            }
        }
    }

    public void hit_or_stand(Scanner scanner){

        scanner.nextLine();
        while (true) {
            System.out.println("\"Would you like to Hit or Stand? Enter 'h' or 's' \"");
            String s = scanner.nextLine();
            if(s.equals("h")) {
                hit();
                System.out.println("Your Current Score: " +  hand.getScore());
                if(hand.getScore() > 21){
                    break;
                }
            } else if (s.equals("s")){
                System.out.println("Player Stands");
                break;
            }
            else{
                System.out.println("Try again");
            }
        }

    }

    public void showSome(){
        System.out.println("Dealers First Card, other is hidden");
        System.out.println(hand.getCards().get(0));
    }

    public void showHand(){
        System.out.println("Players Cards");
        for (int i = 0; i < hand.getCards().size(); i++) {
            System.out.print(hand.getCards().get(i).toString() + " ,");
            System.out.println();
        }
    }

    public void push(){
        System.out.println("Draw");
    }

}
