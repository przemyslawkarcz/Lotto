package Lotto.Inspect;

import Lotto.UserDataInput.NumberFacade;

import java.util.HashSet;
import java.util.Scanner;

public class RepeatedNumbers {

    public static void main(String[] args) {

        RepeatedNumbers repeatedNumbers = new RepeatedNumbers();
        repeatedNumbers.checkForSameNumbers();

    }

    protected int[] checkForSameNumbers (){

        Scanner scanner = new Scanner(System.in);

        int [] enteredIntsArray = new int[6];

        HashSet<Integer> setEnteredInts = new HashSet<>();

        System.out.println("Enter 6 integers from 1 to 49: ");

        for (int i = 0; i < enteredIntsArray.length; i++) {

            System.out.print("\nNumber " + (i+1) + ": ");
            int nextInt = scanner.nextInt();

            enteredIntsArray[i] = nextInt;

            setEnteredInts.add(nextInt);

            int setEnteredIntsSize = setEnteredInts.size();

            System.out.println("Entered numbers: ");
            for (int x:enteredIntsArray) {
                System.out.print(x + "|");
            }
            System.out.println();

            if (setEnteredIntsSize != (i+1)){

                System.out.println("\nNumbers cannot repeat themselves! We only list unique numbers! Start again :)");
                System.exit(0);

            }

        }

        return enteredIntsArray;
    }

}
