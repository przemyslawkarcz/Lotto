package Lotto.Inspect;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class VerificationBetsRangeTest {

    @Test
    public void checksIfBetsNumberIsInRangeTest01(){

        VerificationBetsRange verificationBetsRange = new VerificationBetsRange();
        int i = verificationBetsRange.checksIfBetsNumberIsInRange(1);

        Assertions.assertEquals(1, i);

    }

    @Test
    public void checksIfBetsNumberIsInRangeTest02(){

        VerificationBetsRange verificationBetsRange = new VerificationBetsRange();
        int i2 = verificationBetsRange.checksIfBetsNumberIsInRange(3);

        Assertions.assertEquals(3, i2);

    }

}
