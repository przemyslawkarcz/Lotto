package Lotto.UserDataInput;

import Lotto.Inspect.ExceptionChecksIntegerFormat;
import Lotto.Inspect.InspectFacade;
import java.util.Scanner;

public class BetsNumber {

    protected int checksBetsNumber() throws ExceptionChecksIntegerFormat {

        System.out.println("* * * Enter the number of bets to be placed (up to 3 bets by default) * * *");
        System.out.print("No. of bets: ");

        Scanner scanner = new Scanner(System.in);
        InspectFacade inspectFacade = new InspectFacade();

        int verifiedIntegers = inspectFacade.getVerifiedIntegers(scanner.nextLine());

        int verifiedBetsRange = inspectFacade.getVerifiedBetsRange(verifiedIntegers);

        return verifiedBetsRange;

    }

}
