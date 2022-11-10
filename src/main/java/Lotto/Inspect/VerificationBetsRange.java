package Lotto.Inspect;

public class VerificationBetsRange {

    protected int checksIfBetsNumberIsInRange(Integer numberToCheck) {

        if ((numberToCheck <= 0) || (numberToCheck) > 3 ){

            System.out.println("The number of bets must be between 1 and 3!");
            System.out.println("The game has been stopped! To play restart game :)");
            System.exit(0);

        }

        return numberToCheck;

    }

}
