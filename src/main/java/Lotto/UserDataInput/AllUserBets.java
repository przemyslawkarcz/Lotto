package Lotto.UserDataInput;

import Lotto.Inspect.ExceptionChecksIntegerFormat;

import java.util.Scanner;

public class AllUserBets {

    public static void main(String[] args) {

        executive();


    }

    protected static void executive(){

        int betsNo = 3;
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[6];
        int i = 0;
        int j = 0;

        for (i = 0; i < betsNo; i++) {

            for (j = 0; j < 6; j++) {

                array[i] = scanner.nextInt();

            }

        }
        System.out.print(array[j] + "|");


    }

    protected static void collectsAllUserBets (int someBetsNumber, int[] someBetsArray) {

        int[] numbersFromUserBets;

        for (int i = 0; i < someBetsNumber; i++) {

            numbersFromUserBets = new int[6];

            System.out.print("Bet No. " + (i+1) + ": ");
            for (int userNumber:numbersFromUserBets) {

                System.out.print(userNumber + "|");

            }
            System.out.println();
        }

    }

}
