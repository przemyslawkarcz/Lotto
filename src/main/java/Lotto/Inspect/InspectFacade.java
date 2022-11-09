package Lotto.Inspect;

public class InspectFacade {

    public int getNumberFromRange () throws ExceptionChecksIntegerFormat {

        VerificationUserNumberRange verificationUserNumberRange = new VerificationUserNumberRange();

        return verificationUserNumberRange.checksNumberRange();

    }

    public int getRepeatedUserNumbers () {

        VerificationUserRepeatedNumbers verificationUserRepeatedNumbers = new VerificationUserRepeatedNumbers();
        verificationUserRepeatedNumbers.checkForSameNumbersOriginal();

        return 0;
    }

}
