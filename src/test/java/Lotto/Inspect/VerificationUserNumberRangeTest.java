package Lotto.Inspect;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class VerificationUserNumberRangeTest {

    @Test
    public void checksUserNumberRangeTest01(){

        VerificationUserNumberRange verificationUserNumberRange = new VerificationUserNumberRange();
        int i1 = verificationUserNumberRange.checksUserNumberRange(1);

        Assertions.assertEquals(1, i1);

    }

    @Test
    public void checksUserNumberRangeTest02(){

        VerificationUserNumberRange verificationUserNumberRange = new VerificationUserNumberRange();
        int i2 = verificationUserNumberRange.checksUserNumberRange(49);

        Assertions.assertEquals(49, i2);

    }

    @Test
    public void checksUserNumberRangeTest03(){

        VerificationUserNumberRange verificationUserNumberRange = new VerificationUserNumberRange();
        int i3 = verificationUserNumberRange.checksUserNumberRange(25);

        Assertions.assertEquals(25, i3);

    }

    @Test
    public void checksUserNumberRangeTest04(){

        VerificationUserNumberRange verificationUserNumberRange = new VerificationUserNumberRange();
        int i4 = verificationUserNumberRange.checksUserNumberRange(10);

        Assertions.assertNotEquals(11, i4);

    }

    @Test
    public void checksUserNumberRangeTest05(){

        VerificationUserNumberRange verificationUserNumberRange = new VerificationUserNumberRange();
        int i5 = verificationUserNumberRange.checksUserNumberRange(48);

        Assertions.assertNotEquals(49, i5);

    }

    @Test
    public void checksUserNumberRangeTest06(){

        VerificationUserNumberRange verificationUserNumberRange = new VerificationUserNumberRange();
        int i6 = verificationUserNumberRange.checksUserNumberRange(2);

        Assertions.assertNotEquals(1, i6);

    }

}
