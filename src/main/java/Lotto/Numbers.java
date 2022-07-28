package Lotto;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Numbers {

    public void method (){

        Set<Integer> poolOfNumbers = new HashSet<>();

        poolOfNumbers.addAll(Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49));

        Set<Integer> poolOfNumbersPattern = new HashSet<>();

        poolOfNumbersPattern.addAll(Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49));

        System.out.println(poolOfNumbers);

        //int random = new Random().nextInt(50);
        //System.out.println("Random: " + random);

        boolean remove = poolOfNumbers.remove(6);
        System.out.println(remove);

        System.out.println(poolOfNumbers);




        Set<Integer> difference = new HashSet<>(poolOfNumbersPattern);
        boolean b = difference.removeAll(poolOfNumbers);
        System.out.println("Difference: ");
        System.out.println(difference);

    }



}
