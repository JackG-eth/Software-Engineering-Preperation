package com.hawkins.Person;

import com.hawkins.card_deck.Deck;
import com.hawkins.card_deck.Hand;

public class Dealer extends Person{

    public Dealer(Hand hand, Deck deck) {
        super(hand,deck);
    }

    @Override
    public void showSome() {
        super.showSome();
    }

    @Override
    public void showHand() {
        super.showHand();
    }

    public void dealer_wins(){
        System.out.println("Dealer Wins");
    }
}
