package Lotto.UserDataInput;

import Lotto.Inspect.ExceptionChecksIntegerFormat;

public class UserDataInputFacade {

    public int getBetsNumber() throws ExceptionChecksIntegerFormat {

        BetsNumber betsNumber = new BetsNumber();

        return betsNumber.checksBetsNumber();

    }

    public void getUserBetsNumbers() throws ExceptionChecksIntegerFormat {

        UserNumber userNumber = new UserNumber();

        userNumber.bettingNumber();

    }

}
