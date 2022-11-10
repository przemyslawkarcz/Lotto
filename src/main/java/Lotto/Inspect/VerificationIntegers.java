package Lotto.Inspect;

public class VerificationIntegers {

    protected int checksIfNumberIsInteger(String numberToCheck) throws ExceptionChecksIntegerFormat {

        try {

            return Integer.parseInt(numberToCheck);

        }catch (NumberFormatException numberFormatException){

            throw new ExceptionChecksIntegerFormat(numberToCheck);

        }

    }

}
