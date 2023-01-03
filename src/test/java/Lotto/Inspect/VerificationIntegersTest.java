package Lotto.Inspect;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class VerificationIntegersTest {

    @Test
    public void checksIfNumberIsIntegerTest01() throws ExceptionChecksIntegerFormat {

        VerificationIntegers verificationIntegers = new VerificationIntegers();
        int i1 = verificationIntegers.checksIfNumberIsInteger("10");

        Assertions.assertEquals(10, i1);

    }

    @Test
    public void checksIfNumberIsIntegerTest02() throws ExceptionChecksIntegerFormat {

        VerificationIntegers verificationIntegers = new VerificationIntegers();
        int i2 = verificationIntegers.checksIfNumberIsInteger("12345");

        Assertions.assertEquals(12345, i2);

    }

    @Test
    public void checksIfNumberIsIntegerTest03() throws ExceptionChecksIntegerFormat {

        VerificationIntegers verificationIntegers = new VerificationIntegers();
        int i3 = verificationIntegers.checksIfNumberIsInteger("-54321");

        Assertions.assertEquals(-54321, i3);

    }

    @Test
    public void checksIfNumberIsIntegerTest04() throws ExceptionChecksIntegerFormat {

        VerificationIntegers verificationIntegers = new VerificationIntegers();
        int i4 = verificationIntegers.checksIfNumberIsInteger("0");

        Assertions.assertEquals(0, i4);

    }

    @Test
    public void checksIfNumberIsIntegerTest05() throws ExceptionChecksIntegerFormat {

        VerificationIntegers verificationIntegers = new VerificationIntegers();
        int i5 = verificationIntegers.checksIfNumberIsInteger("123");

        Assertions.assertNotEquals(124, i5);

    }

    @Test
    public void checksIfNumberIsIntegerTest06() throws ExceptionChecksIntegerFormat {

        VerificationIntegers verificationIntegers = new VerificationIntegers();
        int i6 = verificationIntegers.checksIfNumberIsInteger("-98765");

        Assertions.assertNotEquals(-98764, i6);

    }

}
