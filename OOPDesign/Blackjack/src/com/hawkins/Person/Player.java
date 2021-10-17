package com.hawkins.Person;

import com.hawkins.card_deck.Deck;
import com.hawkins.card_deck.Hand;

import java.util.Scanner;

public class Player extends Person {

    Chips chips;
    public Player(Hand hand, Deck deck, Chips chips) {
        super(hand,deck);
        this.chips = chips;
    }

    public void player_busts(){
        System.out.println("Dealer Wins");
        chips.loseBet();
    }

    public void getChips(){
        System.out.println("Your total Chips is: " + chips.getChips());
    }

    public void player_wins(){
        System.out.println("Player Wins");
        chips.winBet();
    }

    @Override
    public void showHand(){
        super.showHand();
    }

    public void takeBet(Scanner scanner) {
        int bet = 0;
        while(true){
            try {
                System.out.println("How many chips would you like to bet?");
                 bet = scanner.nextInt();
                 chips.setBet(bet);
            } catch (Exception e) {
                System.out.println("Sorry invalid bet");
            } finally {
                if (bet > chips.getChips()) {
                    System.out.println("You do not have that many chips");
                }
                else{
                    break;
                }
            }
        }
    }
}
