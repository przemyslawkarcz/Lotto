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

        int someValue = intsArray04[0];
        
        boolean b = false;

        if (someValue>=1 && someValue<=49){

            b = true;

        }

        Assertions.assertTrue(b);

    }
}
