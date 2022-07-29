package Lotto;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumbers {

    public int[] generatesRandomNumbers(){

        Set<Integer> betNumbers = new HashSet<>();

        for (int i = 0; i < 20; i++) {

            Random randomNumber = new Random();
            int randNo = randomNumber.nextInt(50 - 1) + 1;

            betNumbers.add(randNo);

        }

        Object[] betNumbersArray = betNumbers.toArray();
        int [] chosenNumbersArray = new int[6];

        chosenNumbersArray[0] = (int) betNumbersArray[1];
        chosenNumbersArray[1] = (int) betNumbersArray[3];
        chosenNumbersArray[2] = (int) betNumbersArray[5];
        chosenNumbersArray[3] = (int) betNumbersArray[7];
        chosenNumbersArray[4] = (int) betNumbersArray[9];
        chosenNumbersArray[5] = (int) betNumbersArray[11];

        System.out.println("The drawn numbers are: ");

        for (int i:chosenNumbersArray) {


            System.out.print(i + "|");

        }

        return chosenNumbersArray;

    }

}
