package Lotto.Inspect;

public class InspectFacade {

    public int getVerifiedIntegers (String verifiedInteger) throws ExceptionChecksIntegerFormat {

        VerificationIntegers verificationIntegers = new VerificationIntegers();

        return verificationIntegers.checksIfNumberIsInteger(verifiedInteger);

    }

    public int getVerifiedBetsRange (Integer verifiedBetsRange) {

        VerificationBetsRange verificationBetsRange = new VerificationBetsRange();

        return verificationBetsRange.checksIfBetsNumberIsInRange(verifiedBetsRange);

    }

    public int getVerifiedUserNumberRange (Integer verifiedUserNumberRange) {

        VerificationUserNumberRange verificationUserNumberRange = new VerificationUserNumberRange();

        return verificationUserNumberRange.checksUserNumberRange(verifiedUserNumberRange);

    }

}
