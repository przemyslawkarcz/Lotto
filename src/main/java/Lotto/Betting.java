package Lotto;

import java.util.Scanner;

public class Betting {

    public void bettingNumber (){

        System.out.println("* * * Enter the number of bets to be placed * * *");
        System.out.print("No. of bets: ");

        Scanner scanner = new Scanner(System.in);
        int noOfBetsGivenByUser = scanner.nextInt();

        int counterOfBets = 0;

        for (int i = 0; i < noOfBetsGivenByUser; i++) {

            System.out.println("* * * Enter 6 integers for " + (counterOfBets + 1) + " bet * * *" );
            System.out.print("Bet " + (counterOfBets + 1) + ": ");

            counterOfBets++;

            for (int j = 0; j < 6; j++) {

                scanner.nextInt();
                System.out.print(", ");

            }


        }

        System.out.println("Counter of bets: " + counterOfBets);


    }




}
