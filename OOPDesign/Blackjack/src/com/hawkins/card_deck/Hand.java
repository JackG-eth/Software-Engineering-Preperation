package com.hawkins.card_deck;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    List<Card> cards;
    private int score;
    private int aces;

    public Hand() {
        this.cards = new ArrayList<Card>();
        this.score = 0;
        this.aces = 0;
    }


    public void setScore(int score) {
        this.score = score;
    }

    public void setAces(int aces) {
        this.aces = aces;
    }

    public void addCard(Card card) {
        cards.add(card);
        score += card.getRank();
        if (card.getRank() == 11) {
            aces += 1;
        }
    }

    public int getScore() {
        return score;
    }

    public int getAces() {
        return aces;
    }

    public void adjust_for_ace() {
        while (score < 21 && aces > 0) {
            score -= 10;
            aces -= 1;
        }
    }

    public void clearHand() {
        cards.clear();
    }

    public List<Card> getCards() {
        return cards;
    }
}
