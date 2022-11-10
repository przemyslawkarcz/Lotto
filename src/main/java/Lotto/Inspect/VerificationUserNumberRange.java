package Lotto.Inspect;

public class VerificationUserNumberRange {

    protected int checksUserNumberRange(Integer verifiedInteger){

        if (verifiedInteger < 1 || verifiedInteger > 49) {

            System.out.println("Numbers must be between 1 and 49!");
            System.out.println("The game has been stopped! To play restart game :)");

            System.exit(0);

        }

        return verifiedInteger;

    }

}

