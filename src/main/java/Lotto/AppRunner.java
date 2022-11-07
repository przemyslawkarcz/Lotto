package Lotto;

import Lotto.Inspect.ExceptionChecksIntegerFormat;
import Lotto.RandomNumbers.RandomNumbersFacade;

public class AppRunner {

    public static void main(String[] args) throws ExceptionChecksIntegerFormat {

        Betting betting = new Betting();
        betting.bettingNumber();

        RandomNumbersFacade randomNumbersFacade = new RandomNumbersFacade();
        randomNumbersFacade.getSixRandomNumbers();


    }

}
