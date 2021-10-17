package com.hawkins.card_deck;

import java.util.*;

public class Deck {

    private List<Card> cd = new ArrayList<>(52);

    /**
     * might have to change inner code to set Suit/Rank
     */
    public Deck(){
        for(int i = 0; i < 52;){
            for(Rank rank : EnumSet.range(Rank.ACE, Rank.KING)){
                for(Suit suit : EnumSet.range(Suit.Heart, Suit.Black)){
                    cd.add(new Card(rank.getNum(),suit.getSuit()));
                    i++;
                }
            }
        }

    }

    public Deck Refil(){
        return new Deck();
    }

    public Card Deal(){
        Card card = cd.remove(cd.size()-1);
        return card;
    }

    public int getSize(){
        return cd.size();
    }

    public void shuffle(){
        Collections.shuffle(cd);
    }

    @Override
    public String toString() {

        for (int i = 0; i < cd.size(); i++) {
            System.out.println(cd.get(i).toString());
        }
        return "";
    }

}
