package Lotto;

import Lotto.Inspect.ExceptionChecksIntegerFormat;
import Lotto.RandomNumbers.RandomNumbersFacade;
import Lotto.UserDataInput.UserDataInputFacade;
import Lotto.UserMachineListNumbers.UserMachineListNumbersFacade;

public class AppRunner {

    public static void main(String[] args) throws ExceptionChecksIntegerFormat {

        UserDataInputFacade userDataInputFacade = new UserDataInputFacade();
        RandomNumbersFacade randomNumbersFacade = new RandomNumbersFacade();
        UserMachineListNumbersFacade userMachineListNumbersFacade = new UserMachineListNumbersFacade();

        int[] userBetsNumbers = userDataInputFacade.getUserBetsNumbers();
        int[] sixRandomNumbers = randomNumbersFacade.getSixRandomNumbers();

        userMachineListNumbersFacade.getResultsOfDraw(userBetsNumbers, sixRandomNumbers);

    }

}
