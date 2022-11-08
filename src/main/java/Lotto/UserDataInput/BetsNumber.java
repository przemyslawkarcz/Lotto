package Lotto.UserDataInput;

import Lotto.Inspect.ExceptionChecksIntegerFormat;
import Lotto.Inspect.VerificationBetsRange;
import Lotto.Inspect.VerificationIntegers;
import java.util.Scanner;

public class BetsNumber {

    protected int checksBetsNumber() throws ExceptionChecksIntegerFormat {

        System.out.println("* * * Enter the number of bets to be placed * * *");
        System.out.print("No. of bets: ");

        Scanner scanner = new Scanner(System.in);
        VerificationIntegers verificationIntegers = new VerificationIntegers();
        VerificationBetsRange verificationBetsRange = new VerificationBetsRange();

        int noOfBetsGivenByUser = 0;

        try {

            noOfBetsGivenByUser = verificationIntegers.checksIfNumberIsInteger(scanner.nextLine());

        } catch (ExceptionChecksIntegerFormat exceptionChecksIntegerFormat) {

            exceptionChecksIntegerFormat.getFriendlyMessage();

            System.exit(0);
        }

        return verificationBetsRange.checksIfBetsNumberIsInRange(noOfBetsGivenByUser);

    }

}
