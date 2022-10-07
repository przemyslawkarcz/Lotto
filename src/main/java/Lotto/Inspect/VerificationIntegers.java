package Lotto.Inspect;

public class VerificationIntegers {

    public static int checksIfNumberIsInteger(String numberToCheck) throws ExceptionChecksIntegerFormat {

        try {

            return Integer.parseInt(numberToCheck);

        }catch (NumberFormatException exception){

            throw new ExceptionChecksIntegerFormat(numberToCheck);

        }

    }

}
