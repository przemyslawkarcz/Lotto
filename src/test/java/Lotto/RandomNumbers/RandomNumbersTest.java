package Lotto.RandomNumbers;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class RandomNumbersTest {

    @Test
    public void generatesSixUniqueRandomNumbersTest01(){

        RandomNumbers randomNumbers = new RandomNumbers();
        int[] intsArray = randomNumbers.generatesSixUniqueRandomNumbers();

        int length = intsArray.length;

        Assertions.assertEquals(6, length);

    }

    @Test
    public void generatesSixUniqueRandomNumbersTest02(){

        RandomNumbers randomNumbers = new RandomNumbers();
        int[] intsArray02 = randomNumbers.generatesSixUniqueRandomNumbers();

        int length02 = intsArray02.length;

        Assertions.assertNotEquals(5, length02);

    }

    @Test
    public void generatesSixUniqueRandomNumbersTest03(){

        RandomNumbers randomNumbers = new RandomNumbers();
        int[] intsArray03 = randomNumbers.generatesSixUniqueRandomNumbers();

        int someValue = intsArray03[5];

        boolean b = false;

        if (someValue>=1 && someValue<=49){

            b = true;

        }

        Assertions.assertTrue(b);

    }

    @Test
    public void generatesSixUniqueRandomNumbersTest04(){

        RandomNumbers randomNumbers = new RandomNumbers();
        int[] intsArray04 = randomNumbers.generatesSixUniqueRandomNumbers();

        int someValue = intsArray04[4];

        boolean b = false;

        if (someValue>=1 && someValue<=49){

            b = true;

        }

        Assertions.assertTrue(b);

    }

    @Test
    public void generatesSixUniqueRandomNumbersTest05(){

        RandomNumbers randomNumbers = new RandomNumbers();
        int[] intsArray05 = randomNumbers.generatesSixUniqueRandomNumbers();

        int someValue = intsArray05[3];

        boolean b = false;

        if (someValue>=1 && someValue<=49){

            b = true;

        }

        Assertions.assertTrue(b);

    }

    @Test
    public void generatesSixUniqueRandomNumbersTest06(){

        RandomNumbers randomNumbers = new RandomNumbers();
        int[] intsArray06 = randomNumbers.generatesSixUniqueRandomNumbers();

        int someValue = intsArray06[2];

        boolean b = false;

        if (someValue>=1 && someValue<=49){

            b = true;

        }

        Assertions.assertTrue(b);

    }

    @Test
    public void generatesSixUniqueRandomNumbersTest07(){

        RandomNumbers randomNumbers = new RandomNumbers();
        int[] intsArray07 = randomNumbers.generatesSixUniqueRandomNumbers();

        int someValue = intsArray07[1];

        boolean b = false;

        if (someValue>=1 && someValue<=49){

            b = true;

        }

        Assertions.assertTrue(b);

    }

    @Test
    public void generatesSixUniqueRandomNumbersTest08(){

        RandomNumbers randomNumbers = new RandomNumbers();
        int[] intsArray08 = randomNumbers.generatesSixUniqueRandomNumbers();

        int someValue = intsArray08[0];

        boolean b = false;

        if (someValue>=1 && someValue<=49){

            b = true;

        }

        Assertions.assertTrue(b);

    }
    
}
