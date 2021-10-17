package com.hawkins.Person;


import java.io.Console;
import java.util.Scanner;

public class Chips {

    private int chips;
    private int bet = 0;

    public Chips() {
        this.chips = 100;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    public void winBet() {
        chips += bet;
    }

    public void loseBet() {
        chips -= bet;
    }

    public int getChips() {
        return chips;
    }

    public int getBet() {
        return bet;
    }

}
