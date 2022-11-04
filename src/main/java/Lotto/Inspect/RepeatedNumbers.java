package Lotto.Inspect;

import Lotto.UserDataInput.NumberFacade;

import java.util.Scanner;

public class RepeatedNumbers {

    public static void main(String[] args) {

        int checkForSameNumbers = checkForSameNumbers();
        System.out.println(checkForSameNumbers);

    }

    protected static int checkForSameNumbers (){

        Scanner scanner = new Scanner(System.in);

        Integer [] tabWithInts = new Integer[]{0, 0, 0, 0, 0, 0};

        for (int i = 0; i < tabWithInts.length; i++) {

            System.out.print("\nYour int no. " + (i+1) + ": " );
            int nextInt = scanner.nextInt();


            if (tabWithInts[i] != nextInt){

            }else {

                System.out.println("JEST!");

            }

            tabWithInts[i] = nextInt;

            System.out.println("Your numbers: ");

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
