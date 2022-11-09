package Lotto.UserDataInput;

import Lotto.Inspect.ExceptionChecksIntegerFormat;
import Lotto.Inspect.NumericalRange;

public class UserDataInputFacade {

    public int getBetsNumber () throws ExceptionChecksIntegerFormat {

        BetsNumber betsNumber = new BetsNumber();

        return betsNumber.checksBetsNumber();

    }

}
