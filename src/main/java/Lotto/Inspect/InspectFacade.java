package Lotto.Inspect;

public class InspectFacade {

    public int getNumberFromRange () throws ExceptionChecksIntegerFormat {

        NumericalRange numericalRange = new NumericalRange();

        return numericalRange.checksNumberRange();

    }

}
