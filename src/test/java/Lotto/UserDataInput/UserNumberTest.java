package Lotto.UserDataInput;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.util.HashSet;

public class UserNumberTest {

    @Test
    public void bettingNumberTest01(){

        int betsNumber = 1;

        int [][] bettingScoreboard2D = new int[betsNumber][];
        int [] enteredIntsArray;

        for (int i = 0; i < betsNumber; i++) {

            enteredIntsArray = new int[]{1, 11, 22, 2, 44, 4};

            bettingScoreboard2D[i] = enteredIntsArray;

        }

        int[] intsArrayForTest = new int[]{1, 11, 22, 2, 44, 4};

        Assertions.assertEquals(intsArrayForTest[2], bettingScoreboard2D[0][2]);

    }

    @Test
    public void bettingNumberTest02() {

        int betsNumber = 1;

        int [][] bettingScoreboard2D = new int[betsNumber][];
        int [] enteredIntsArray;

        for (int i = 0; i < betsNumber; i++) {

            enteredIntsArray = new int[]{1, 11, 22, 2, 44, 4};

            bettingScoreboard2D[i] = enteredIntsArray;

        }

        int[] intsArrayForTest = new int[]{1, 11, 22, 2, 44, 9};

        Assertions.assertNotEquals(intsArrayForTest[5], bettingScoreboard2D[0][5]);

    }

    @Test
    public void bettingNumberTest03() {

        int betsNumber = 3;

        int [][] bettingScoreboard2D = new int[betsNumber][];
        int [] enteredIntsArray01 = new int[]{1, 2, 3, 4, 5, 6};
        int [] enteredIntsArray02 = new int[]{11, 12, 13, 14, 15, 16};
        int [] enteredIntsArray03 = new int[]{21, 22, 23, 24, 25, 26};

        bettingScoreboard2D[0] = enteredIntsArray01;
        bettingScoreboard2D[1] = enteredIntsArray02;
        bettingScoreboard2D[2] = enteredIntsArray03;

        int[] intsArrayForTest = new int[]{1, 11, 21, 31, 41, 49};

        Assertions.assertEquals(intsArrayForTest[0], bettingScoreboard2D[0][0]);

    }

    @Test
    public void bettingNumberTest04() {

        int betsNumber = 3;

        int [][] bettingScoreboard2D = new int[betsNumber][];
        int [] enteredIntsArray01 = new int[]{9, 8, 7, 6, 5, 4};
        int [] enteredIntsArray02 = new int[]{19, 18, 17, 16, 15, 14};
        int [] enteredIntsArray03 = new int[]{29, 28, 27, 26, 25, 24};

        bettingScoreboard2D[0] = enteredIntsArray01;
        bettingScoreboard2D[1] = enteredIntsArray02;
        bettingScoreboard2D[2] = enteredIntsArray03;

        int[] intsArrayForTest = new int[]{44, 17, 44, 42, 41, 40};

        Assertions.assertEquals(intsArrayForTest[1], bettingScoreboard2D[1][2]);

    }

    @Test
    public void bettingNumberTest05() {

        int betsNumber = 3;

        int [][] bettingScoreboard2D = new int[betsNumber][];
        int [] enteredIntsArray01 = new int[]{40, 42, 44, 46, 48, 1};
        int [] enteredIntsArray02 = new int[]{31, 13, 23, 33, 43, 3};
        int [] enteredIntsArray03 = new int[]{21, 12, 22, 32, 42, 2};

        bettingScoreboard2D[0] = enteredIntsArray01;
        bettingScoreboard2D[1] = enteredIntsArray02;
        bettingScoreboard2D[2] = enteredIntsArray03;

        int[] intsArrayForTest = new int[]{1, 3, 42, 7, 9, 11};

        Assertions.assertEquals(intsArrayForTest[2], bettingScoreboard2D[2][4]);

    }

    @Test
    public void bettingNumberTest06() {

        int betsNumber = 3;

        int [][] bettingScoreboard2D = new int[betsNumber][];
        int [] enteredIntsArray01 = new int[]{2, 4, 6, 8, 10, 12};
        int [] enteredIntsArray02 = new int[]{3, 6, 9, 12, 15, 18};
        int [] enteredIntsArray03 = new int[]{5, 10, 15, 25, 30, 35};

        bettingScoreboard2D[0] = enteredIntsArray01;
        bettingScoreboard2D[1] = enteredIntsArray02;
        bettingScoreboard2D[2] = enteredIntsArray03;

        int[] intsArrayForTest = new int[]{13, 13, 15, 26, 18, 40};

        Assertions.assertNotEquals(intsArrayForTest[0], bettingScoreboard2D[0][5]);

    }

    @Test
    public void bettingNumberTest07() {

        int betsNumber = 3;

        int [][] bettingScoreboard2D = new int[betsNumber][];
        int [] enteredIntsArray01 = new int[]{2, 40, 6, 18, 10, 11};
        int [] enteredIntsArray02 = new int[]{3, 16, 9, 22, 15, 11};
        int [] enteredIntsArray03 = new int[]{7, 10, 17, 25, 32, 35};

        bettingScoreboard2D[0] = enteredIntsArray01;
        bettingScoreboard2D[1] = enteredIntsArray02;
        bettingScoreboard2D[2] = enteredIntsArray03;

        int[] intsArrayForTest = new int[]{29, 27, 25, 11, 6, 5};

        Assertions.assertNotEquals(intsArrayForTest[5], bettingScoreboard2D[1][0]);

    }

    @Test
    public void bettingNumberTest08() {

        int betsNumber = 3;

        int [][] bettingScoreboard2D = new int[betsNumber][];
        int [] enteredIntsArray01 = new int[]{12, 40, 16, 18, 20, 11};
        int [] enteredIntsArray02 = new int[]{3, 20, 9, 26, 15, 15};
        int [] enteredIntsArray03 = new int[]{10, 10, 20, 25, 35, 35};

        bettingScoreboard2D[0] = enteredIntsArray01;
        bettingScoreboard2D[1] = enteredIntsArray02;
        bettingScoreboard2D[2] = enteredIntsArray03;

        int[] intsArrayForTest = new int[]{12, 18, 22, 10, 11, 44};

        Assertions.assertNotEquals(intsArrayForTest[4], bettingScoreboard2D[2][0]);

    }

    @Test
    public void bettingNumberTest09() {

        int betsNumber = 1;

        int [] enteredIntsArray;
        String someText = "";

        for (int i = 0; i < betsNumber; i++) {

            enteredIntsArray = new int[]{1, 11, 22, 2, 44, 22};

            HashSet<Integer> setEnteredInts = new HashSet<>();

            System.out.println();
            for (int j = 0; j < enteredIntsArray.length; j++) {

                setEnteredInts.add(enteredIntsArray[j]);

                if (setEnteredInts.size() != (j+1)){

                    someText = "Numbers cannot repeat themselves!";

                }

            }

        }

        Assertions.assertEquals("Numbers cannot repeat themselves!", someText);

    }

}
