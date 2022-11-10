package Lotto;

import Lotto.Inspect.ExceptionChecksIntegerFormat;
import Lotto.RandomNumbers.RandomNumbersFacade;
import Lotto.UserDataInput.UserDataInputFacade;

public class AppRunner {

    public static void main(String[] args) throws ExceptionChecksIntegerFormat {

        UserDataInputFacade userDataInputFacade = new UserDataInputFacade();
        RandomNumbersFacade randomNumbersFacade = new RandomNumbersFacade();

        userDataInputFacade.getUserBetsNumbers();
        randomNumbersFacade.getSixRandomNumbers();

    }

}
