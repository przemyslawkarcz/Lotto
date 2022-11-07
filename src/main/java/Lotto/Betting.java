package Lotto;

import Lotto.Inspect.ExceptionChecksIntegerFormat;
import Lotto.UserDataInput.NumberFacade;

public class Betting {

    public void bettingNumber () throws ExceptionChecksIntegerFormat {

        int noOfBetsGivenByUser = 0;

        NumberFacade numberFacade = new NumberFacade();
        noOfBetsGivenByUser = numberFacade.getBetsNumber();

        int counterOfBets = 0;

        for (int i = 0; i < noOfBetsGivenByUser; i++) {

            System.out.println("* * * Enter 6 integers (1-49) for " + (counterOfBets + 1) + " bet * * *" );
            System.out.print(" - Bet " + (counterOfBets + 1) + " - ");

            counterOfBets++;

            int counterOfIntegers = 0;

            System.out.println();
            for (int j = 0; j < 6; j++) {

                System.out.print("Integer " + (++counterOfIntegers) + ": ");

                numberFacade.getNumberFromRange();

            }

        }

        System.out.println("Counter of bets: " + counterOfBets);

    }




}
