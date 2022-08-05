package Lotto;

import Lotto.Inspect.ExceptionChecksDataFormat;

public class AppRunner {

    public static void main(String[] args) throws ExceptionChecksDataFormat {

        Numbers numbers = new Numbers();
        //numbers.method();

        Betting betting = new Betting();
        betting.bettingNumber();

        RandomNumbers randomNumbers = new RandomNumbers();
        //randomNumbers.generatesRandomNumbers();


    }

}
