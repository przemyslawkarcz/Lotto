package Lotto.UserDataInput;

import Lotto.Inspect.ExceptionChecksIntegerFormat;

public class BetsNumberFacade {

    public int getBetsNumber () throws ExceptionChecksIntegerFormat {

        BetsNumber betsNumber = new BetsNumber();

        return betsNumber.checksBetsNumber();

    }

}
