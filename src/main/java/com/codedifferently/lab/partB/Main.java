package com.codedifferently.lab.partB;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Coin coin1 = new Coin("Penny", .01);
        Coin coin2 = new Coin("Quarter", .25);
        Coin coin3 = new Coin("Dime", .10);
        Coin coin4 = new Coin("Penny", .01);
        System.out.println(coin1);
        System.out.println(coin2);
        System.out.println(coin3);
        System.out.println(coin4);
        Coin[] coinArray = new Coin[4];
        coinArray[0] = coin1;
        coinArray[1] = coin2;
        coinArray[2] = coin3;
        coinArray[3] = coin4;
        int Penny = 0;
        int Dime = 0;
        int Quarter = 0;
        for (int i = 0; i < coinArray.length; i++) {

            System.out.println(coinArray[i].getName());
            if(coinArray[i].getName() == "Penny"){
                Penny ++;
            }
            if(coinArray[i].getName() == "Dime"){
                Dime ++;
            }
            if(coinArray[i].getName() == "Quarter"){
                Quarter ++;
            }

        }
        System.out.println("You have: " + Penny + " Pennys, " + Dime + " Dimes, and " + Quarter + " Quarters,");
    }
}
