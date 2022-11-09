package Lotto.UserDataInput;

import Lotto.Inspect.ExceptionChecksIntegerFormat;

public class UserDataInputFacade {

    public int getBetsNumber () throws ExceptionChecksIntegerFormat {

        BetsNumber betsNumber = new BetsNumber();

        return betsNumber.checksBetsNumber();

    }

    public int getNumberFromRange () throws ExceptionChecksIntegerFormat {

        NumericalRange numericalRange = new NumericalRange();

        return numericalRange.checksNumberRange();

    }

}
