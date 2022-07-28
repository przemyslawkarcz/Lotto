package Lotto;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumbers {

    public static void main(String[] args) {

        randomNumbers();

    }

    public static void randomNumbers(){

        Set<Integer> betNumbers = new HashSet<>();
        //int[] betNumbersArray = new int[betNumbers.size()];
        int counter = 0;
        //do {

            for (int i = 0; i < 20; i++) {

                Random randomNumber = new Random();
                int i1 = randomNumber.nextInt(50);

                System.out.print(i1 + ", ");
                counter++;
                betNumbers.add(i1);

            }

        System.out.println("\ncounter: " + counter);
        System.out.println();
        System.out.println(betNumbers);

        Object[] objects = betNumbers.toArray();

        for (int i = 0; i < 6; i++) {

            System.out.print(objects[i] + "|");

        }

        //}while (betNumbers.size()>5 && betNumbers.size()<7);

        //System.out.println("\nbetNumbers:");
        //System.out.println(betNumbers);

    }

}
