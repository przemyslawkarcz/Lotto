package Lotto;

import Lotto.Inspect.ExceptionChecksDataFormat;
import Lotto.Inspect.Verify;

import java.util.HashSet;
import java.util.Scanner;

public class Betting {

    public void bettingNumber () throws ExceptionChecksDataFormat {

        System.out.println("* * * Enter the number of bets to be placed * * *");
        System.out.print("No. of bets: ");

        Scanner scanner = new Scanner(System.in);
        Verify verify = new Verify();

        int noOfBetsGivenByUser = 0;

        try {
            noOfBetsGivenByUser = Verify.checksIfNumberIsInteger(scanner.nextLine());
        }catch (ExceptionChecksDataFormat exceptionChecksDataFormat){
            exceptionChecksDataFormat.getFriendlyMessage();
            return ;
        }

        int counterOfBets = 0;
        int counterOfIntegers = 0;

        for (int i = 0; i < noOfBetsGivenByUser; i++) {

            System.out.println("* * * Enter 6 integers (1-49) for " + (counterOfBets + 1) + " bet * * *" );
            System.out.print(" - Bet " + (counterOfBets + 1) + " - ");

            counterOfBets++;

            System.out.println();
            for (int j = 0; j < 6; j++) {

                System.out.print("integer " + (++counterOfIntegers) + ": ");
                String number1_49GivenByUser = scanner.nextLine();

                verify.checksIfNumberIsInteger(number1_49GivenByUser);

                //verify.checksIfNumbersAreInRange1_49(number1_49GivenByUser);

            }


        }

        System.out.println("Counter of bets: " + counterOfBets);


    }




}
