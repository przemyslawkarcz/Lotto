package Lotto.UserDataInput;

import Lotto.Inspect.ExceptionChecksIntegerFormat;
import Lotto.Inspect.InspectFacade;
import java.util.HashSet;
import java.util.Scanner;

public class UserNumber {

    protected void bettingNumber() throws ExceptionChecksIntegerFormat {

        UserDataInputFacade userDataInputFacade = new UserDataInputFacade();
        InspectFacade inspectFacade = new InspectFacade();
        Scanner scanner = new Scanner(System.in);

        int betsNumber = userDataInputFacade.getBetsNumber();

        int counterOfBets = 0;

        for (int i = 0; i < betsNumber; i++) {

            int [] enteredIntsArray = new int[6];

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

                enteredIntsArray[i] = verifiedUserNumberRange;

                setEnteredInts.add(verifiedUserNumberRange);

                if (setEnteredInts.size() != (j+1)){

                    System.out.println("\nNumbers cannot repeat themselves! We only list unique numbers! Start again :)");
                    System.exit(0);

                }

            }

            //xxxxxxxxxxxxxxxxxxxxxxxxxx 10.11.2022
            //metoda powinna zwracać tablicę z danymi użytkownika
            /*System.out.println("Entered user numbers in the " + counterOfBets + " bet/s:");
            for (int enteredUserNumber:enteredIntsArray) {
                System.out.print(enteredUserNumber + "|");
            }*/

        }

    }

}
