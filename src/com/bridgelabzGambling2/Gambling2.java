package com.bridgelabzGambling2;

import java.util.Scanner;

public class Gambling2 {
    static int totalWinnigAmount = 0;
    static int winDaysCount = 0;
    static int lossDaysCount = 0;
    static final int MAX_DAYS = 20;
    static final int EVERY_DAY_STAKE = 100;

    public static void main(String[] args) {
        Gambler();
        if (totalWinnigAmount > 0){
            System.out.println("you Won! ");
            System.out.println("continue playing (y/n) : ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.next().equalsIgnoreCase("y")){
                Gambler();
            }
        }else if (totalWinnigAmount < 0){
            System.out.println("you lost the game");
        }else{
            System.out.println("no win or no loss");
        }

    }

    static void Gambler() {
        for (int day = 1; day < MAX_DAYS; day++) {
            int dayStake = EVERY_DAY_STAKE;
            int winningAmount;
            System.out.println("#day" + day);
            while (dayStake < 150 && dayStake > 50) {
                dayStake += doBet(1);
            }
            winningAmount = (dayStake - 100);
            System.out.println("winning Amount = " + winningAmount);
            if (winningAmount > 0) {
                totalWinnigAmount = totalWinnigAmount + winningAmount;
                winDaysCount++;
            } else {
                lossDaysCount++;
                totalWinnigAmount = totalWinnigAmount + winningAmount;
            }
        }
        System.out.println("\ntotal winning Amount " + totalWinnigAmount);
        System.out.println("won days = " + winDaysCount);
        System.out.println("loss Days =  " + lossDaysCount);
    }


    static int doBet(int bidPrice) {
        int random = (int) (Math.random() * 10) % 2;
        if (random == 1) {
            return +bidPrice;
        } else {
            return -bidPrice;
        }
    }
}





