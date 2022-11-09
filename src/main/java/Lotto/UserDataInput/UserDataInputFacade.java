package Lotto.UserDataInput;

import Lotto.Inspect.ExceptionChecksIntegerFormat;

public class UserDataInputFacade {

    public int getBetsNumber () throws ExceptionChecksIntegerFormat {

        BetsNumber betsNumber = new BetsNumber();

        return betsNumber.checksBetsNumber();

    }

}
