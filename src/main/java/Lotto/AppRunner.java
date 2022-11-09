package Lotto;

import Lotto.Inspect.ExceptionChecksIntegerFormat;
import Lotto.RandomNumbers.RandomNumbersFacade;
import Lotto.UserDataInput.UserNumbers;

public class AppRunner {

    public static void main(String[] args) throws ExceptionChecksIntegerFormat {

        UserNumbers userNumbers = new UserNumbers();
        userNumbers.bettingNumber();

        RandomNumbersFacade randomNumbersFacade = new RandomNumbersFacade();
        randomNumbersFacade.getSixRandomNumbers();


    }

}
