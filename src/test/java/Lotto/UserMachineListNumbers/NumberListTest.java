package Lotto.UserMachineListNumbers;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class NumberListTest {

    @Test
    public void comparesUserNumbersWithRandomOnesTest01(){

        int[][] array2D = new int[1][];
        int[] array1D_bet01 = new int[]{1, 11, 21, 31, 41, 49};

        array2D[0] = array1D_bet01;

        int[] numbersSelectedInDraw = new int[]{4, 11, 24, 34, 44, 48};

        NumbersList numbersList = new NumbersList();
        int i = numbersList.comparesUserNumbersWithRandomOnes(array2D, numbersSelectedInDraw);

        Assertions.assertEquals(1, i);

    }

    @Test
    public void comparesUserNumbersWithRandomOnesTest02(){

        int[][] array2D = new int[1][];
        int[] array1D_bet02 = new int[]{2, 12, 22, 32, 42, 49};

        array2D[0] = array1D_bet02;

        int[] numbersSelectedInDraw = new int[]{1, 2, 3, 32, 41, 48};

        NumbersList numbersList = new NumbersList();
        int i = numbersList.comparesUserNumbersWithRandomOnes(array2D, numbersSelectedInDraw);

        Assertions.assertEquals(2, i);

    }

    @Test
    public void comparesUserNumbersWithRandomOnesTest03(){

        int[][] array2D = new int[1][];
        int[] array1D_bet03 = new int[]{3, 13, 23, 33, 43, 49};

        array2D[0] = array1D_bet03;

        int[] numbersSelectedInDraw = new int[]{1, 13, 23, 24, 43, 44};

        NumbersList numbersList = new NumbersList();
        int i = numbersList.comparesUserNumbersWithRandomOnes(array2D, numbersSelectedInDraw);

        Assertions.assertEquals(3, i);

    }

    @Test
    public void comparesUserNumbersWithRandomOnesTest04(){

        int[][] array2D = new int[1][];
        int[] array1D_bet03 = new int[]{4, 14, 24, 34, 44, 49};

        array2D[0] = array1D_bet03;

        int[] numbersSelectedInDraw = new int[]{49, 44, 35, 24, 15, 4};

        NumbersList numbersList = new NumbersList();
        int i = numbersList.comparesUserNumbersWithRandomOnes(array2D, numbersSelectedInDraw);

        Assertions.assertEquals(4, i);

    }

    @Test
    public void comparesUserNumbersWithRandomOnesTest05(){

        int[][] array2D = new int[1][];
        int[] array1D_bet03 = new int[]{5, 15, 25, 35, 45, 49};

        array2D[0] = array1D_bet03;

        int[] numbersSelectedInDraw = new int[]{49, 45, 35, 25, 15, 6};

        NumbersList numbersList = new NumbersList();
        int i = numbersList.comparesUserNumbersWithRandomOnes(array2D, numbersSelectedInDraw);

        Assertions.assertEquals(5, i);

    }

    @Test
    public void comparesUserNumbersWithRandomOnesTest06(){

        int[][] array2D = new int[1][];
        int[] array1D_bet03 = new int[]{6, 16, 26, 36, 46, 49};

        array2D[0] = array1D_bet03;

        int[] numbersSelectedInDraw = new int[]{26, 46, 49, 36, 6, 16};

        NumbersList numbersList = new NumbersList();
        int i = numbersList.comparesUserNumbersWithRandomOnes(array2D, numbersSelectedInDraw);

        Assertions.assertEquals(6, i);

    }

}
