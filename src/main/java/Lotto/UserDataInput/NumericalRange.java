package Lotto.UserDataInput;

import Lotto.Inspect.ExceptionChecksIntegerFormat;
import Lotto.Inspect.VerificationIntegers;
import java.util.Scanner;

public class NumericalRange {

    protected int checksNumberRange() throws ExceptionChecksIntegerFormat {

        Scanner scanner = new Scanner(System.in);
        VerificationIntegers verificationIntegers = new VerificationIntegers();

        int isInteger = 0;

        String number1_49GivenByUser = scanner.nextLine();

        try {

           isInteger = verificationIntegers.checksIfNumberIsInteger(number1_49GivenByUser);

        }catch (ExceptionChecksIntegerFormat exceptionChecksIntegerFormat){

            exceptionChecksIntegerFormat.getFriendlyMessage();

            System.exit(0);

        }

        if (isInteger < 1 || isInteger > 49){

            System.out.println("Numbers must be between 1 and 49!");
            System.out.println("The game has been stopped! To play restart game :)");

            System.exit(0);

        }else {

            return isInteger;

        }

        return isInteger;
    }



}
