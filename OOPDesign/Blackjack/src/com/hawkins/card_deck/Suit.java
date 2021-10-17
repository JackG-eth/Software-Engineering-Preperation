package com.hawkins.card_deck;

public enum Suit {

    Heart("\u2663"),Diamond("\u2666"),Club("\u2665"),Black("\u2660");

    private String Suit;

    Suit(String suit) {
        this.Suit = suit;
    }

    public String getSuit() {
        return Suit;
    }

    public void setSuit(String suit) {
        Suit = suit;
    }
}
