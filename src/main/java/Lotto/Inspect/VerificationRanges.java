package Lotto.Inspect;

public class VerificationRanges {

    public static int checksIfNumbersAreInRange1_49(int numberToCheck) throws ExceptionChecksRange{

        /*try { xxxxxxxxxxxxxxxxxxxxxxxx 07.20.2022

            return Integer.parseInt(numberToCheck);

        }catch (NumberFormatException exception){

            throw new ExceptionChecksIntegerFormat(numberToCheck);

        }*/




        if (1 > numberToCheck || numberToCheck > 49){

            System.out.println("Only numbers in range 1-49 are allowed!");
            System.out.println("Start again please :)");
            System.exit(0);

        }

        return numberToCheck;
    }

}
