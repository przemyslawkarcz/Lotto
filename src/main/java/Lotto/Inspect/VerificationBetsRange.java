package Lotto.Inspect;

public class VerificationBetsRange {

    public int checksIfBetsNumberIsInRange (Integer numberToCheck) {

        if ((numberToCheck <= 0) || (numberToCheck) > 100 ){

            System.out.println("The number of bets must be between 1 and 100!");
            System.out.println("The game has been stopped! To play restart game :)");
            System.exit(0);

        }

        return numberToCheck;

    }

}
