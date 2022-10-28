package Lotto.Inspect;

import Lotto.UserDataInput.NumberFacade;

import java.util.Scanner;

public class RepeatedNumbers {

    public static void main(String[] args) {

        int checkForSameNumbers = checkForSameNumbers();
        System.out.println(checkForSameNumbers);

    }

    protected static int checkForSameNumbers (){

        System.out.println("Your int: ");
        Scanner scanner = new Scanner(System.in);

        Integer [] tabWithInts = new Integer[]{0, 0, 0, 0, 0, 0};

        for (int i = 0; i < 6; i++) {

            System.out.println();
            int nextInt = scanner.nextInt();

            tabWithInts[i] = nextInt;

            for (Integer integer:tabWithInts) {
                System.out.print(integer + "|");
            }

        }

        /*for (Integer integer:tabWithInts) {
            System.out.print(integer + "|");
        }*/

        return 0;
    }

}
