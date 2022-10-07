package Lotto;

import Lotto.Inspect.ExceptionChecksDataFormat;
import Lotto.RandomNumbers.RandomNumbers;
import Lotto.RandomNumbers.RandomNumbersFacade;

public class AppRunner {

    public static void main(String[] args) throws ExceptionChecksDataFormat {

        Numbers numbers = new Numbers();
        //numbers.method();

        Betting betting = new Betting();
        //betting.bettingNumber();

        RandomNumbersFacade randomNumbersFacade = new RandomNumbersFacade();
        randomNumbersFacade.getSixRandomNumbers();


    }

}
