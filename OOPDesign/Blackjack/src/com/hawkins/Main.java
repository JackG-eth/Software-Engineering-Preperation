package com.hawkins;

import com.hawkins.Person.Chips;
import com.hawkins.Person.Dealer;
import com.hawkins.Person.Player;
import com.hawkins.card_deck.Deck;
import com.hawkins.card_deck.Hand;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
<<<<<<< HEAD:OOPDesign/Blackjack/src/com/hawkins/StartGame.java

        ArrayList<String> list = new ArrayList<>();
=======
        boolean playing = true;
>>>>>>> 7ab6cec39fe1ccc48b006d099c8c91f352d2e352:OOPDesign/Blackjack/src/com/hawkins/Main.java
        // write your code here
        Deck deck = new Deck();
        deck.shuffle();

        Player player = new Player(new Hand(), deck, new Chips());
        Dealer dealer = new Dealer(new Hand(), deck);

        while (playing) {

            player.hit();
            dealer.hit();
            player.hit();
            dealer.hit();

            player.takeBet(scanner);

            player.showHand();
            dealer.showSome();

            player.hit_or_stand(scanner);

            if (player.getScore() > 21){
                System.out.println("----------------------------");
                player.player_busts();
            }

            else if (player.getScore() <= 21){
                while(dealer.getScore() < 17){
                    dealer.hit();
                }
                System.out.println("----------------------------");
                System.out.println("Dealer Score: " + dealer.getScore()  + " Player score: " + player.getScore());

                if(dealer.getScore() > 21 ){
                    player.player_wins();
                }

                else if(dealer.getScore() > player.getScore() ){
                    player.player_busts();
                }
                else if(dealer.getScore() < player.getScore() ){
                    player.player_wins();
                }
                else{
                    player.push();
                }
            }

            player.getChips();
            System.out.println("Would you like to play again? Enter 'y' or 'n' \\\"\"");
            String s = scanner.nextLine();
            if(s.equals("y")){
                playing = true;
                player.clearHand();
                dealer.clearHand();
                deck = deck.Refil();
            }
            else{
                System.out.println("thanks for playing");
                player.getChips();
                playing = false;
            }
        }

    }




}
