package Lotto;

import java.util.Random;

public class DoCwiczen {

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {

            getRandomNumberUsingNextInt(1, 49);


        }

    }

    public static int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();

        System.out.println();

        for (int i = 0; i < 6; i++) {

            //int nextInt = random.nextInt(max - min) + min;
            int nextInt = random.nextInt(50 - 1) + 1;

            if (nextInt == 0){

                System.out.println("0!");
                System.exit(0);

            }

            System.out.print(nextInt + "|");

        }
        return random.nextInt(max - min) + min;
    }

}
