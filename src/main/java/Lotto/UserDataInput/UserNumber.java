package Lotto.UserDataInput;

import Lotto.DoCwiczen01;
import Lotto.Inspect.ExceptionChecksIntegerFormat;
import Lotto.Inspect.InspectFacade;
import java.util.HashSet;
import java.util.Scanner;

public class UserNumber {

    protected int[] bettingNumber() throws ExceptionChecksIntegerFormat {

        UserDataInputFacade userDataInputFacade = new UserDataInputFacade();
        InspectFacade inspectFacade = new InspectFacade();
        Scanner scanner = new Scanner(System.in);

        int betsNumber = userDataInputFacade.getBetsNumber();

        int counterOfBets = 0;

        int [][] bettingScoreboard2D = new int[betsNumber][];
        int [] enteredIntsArray = new int[0];

        for (int i = 0; i < betsNumber; i++) {

            enteredIntsArray = new int[6];

            HashSet<Integer> setEnteredInts = new HashSet<>();

            System.out.println("* * * Enter 6 integers (1-49) for " + (counterOfBets + 1) + " bet * * *" );
            System.out.print(" - Bet " + (counterOfBets + 1) + " - ");

            counterOfBets++;

            int counterOfIntegers = 0;

            System.out.println();
            for (int j = 0; j < enteredIntsArray.length; j++) {

                System.out.print("Integer " + (++counterOfIntegers) + ": ");

                int verifiedIntegers = inspectFacade.getVerifiedIntegers(scanner.nextLine());

                int verifiedUserNumberRange = inspectFacade.getVerifiedUserNumberRange(verifiedIntegers);

                enteredIntsArray[j] = verifiedUserNumberRange;

                setEnteredInts.add(verifiedUserNumberRange);

                if (setEnteredInts.size() != (j+1)){

                    System.out.println("\nNumbers cannot repeat themselves! We only list unique numbers! Start again :)");
                    System.exit(0);

                }

            }

            System.out.println("\n* * * Entered user numbers in the " + counterOfBets + " bet/s: * * *");
            for (int enteredUserNumber:enteredIntsArray) {
                System.out.print(enteredUserNumber + "|");
            }
            System.out.println();
            System.out.println();

            bettingScoreboard2D[i] = enteredIntsArray;

        }

        System.out.println("* * * Summary of all " + counterOfBets + " client bets * * *");
        for (int i = 0; i < bettingScoreboard2D.length; i++) {
            System.out.print("Bet " + (i+1) + ": ");
            for (int j = 0; j < bettingScoreboard2D[i].length; j++) {
                System.out.print(bettingScoreboard2D[i][j] + "|");
            }
            System.out.println();
        }

        return enteredIntsArray;
    }

}
