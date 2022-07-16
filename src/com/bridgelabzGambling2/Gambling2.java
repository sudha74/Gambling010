package com.bridgelabzGambling2;

import java.util.Scanner;

public class Gambling2 {
    static int totalWinnigAmount=0;
    static int winDaysCount=0;
    static int lossDaysCount=0;
    static final int MAX_DAYS=20;
    static final int EVERY_DAY_STAKE=100;
    public static void main(String[] args) {
        new Gambler();
        if (totalWinnigAmount > 0) {
            System.out.println("you Won ! ");
            System.out.println("continue Playing (y/n) : ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.next().equalsIgnoreCase("y")) {
                new Gambler();
            }
        }else if (totalWinnigAmount < 0){
            System.out.println("you lost the game");
        }else{
            System.out.println("no win or loss");
        }
    }
    



}
