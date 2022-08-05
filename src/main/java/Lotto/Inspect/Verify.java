package Lotto.Inspect;

import java.util.InputMismatchException;

public class Verify {

    public static int checksIfNumberIsInteger(String numberToCheck) throws ExceptionChecksDataFormat{

        try {

            return Integer.parseInt(numberToCheck);

        }catch (NumberFormatException exception){

            throw new ExceptionChecksDataFormat(numberToCheck);

        }

    }

    public int checksIfNumbersAreInRange1_49(int numberToCheck){

        if (1 > numberToCheck || numberToCheck > 49){

        System.out.println("Only numbers in range 1-49 are allowed!");
        System.out.println("Start again please :)");
        System.exit(0);

       }

        return numberToCheck;
    }

}
