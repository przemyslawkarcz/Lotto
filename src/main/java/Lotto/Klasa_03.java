package Lotto;

import java.util.Scanner;

public class Klasa_03 {

    public static void main(String[] args) {

        //checksDoubletsOfNumbers();
        twoTabs();

    }

    public static void checksDoubletsOfNumbers (){

        int [] tab = new int[]{0, 0, 0, 0, 0, 0};
        int x = 0;

        Scanner scanner = new Scanner(System.in);

        for (int z:tab) {
            System.out.print(z + "/");
        }

        for (int i = 0; i < tab.length; i++) {

            tab[i] = scanner.nextInt();

            if (tab[i] != x){

            }else {

                System.out.println("JEST!");
            }

        }

        for (int y:tab) {
            System.out.print(y + "|");
        }

    }

    public static void twoTabs(){

        int[] tab01 = new int[]{1, 2, 3};
        int[] tab02 = new int[]{11, 22, 33, 44, 55, 2, 66, 77, 88};

        for (int i = 0; i < tab01.length; i++) {

            for (int j = 0; j < tab02.length; j++) {

                if (tab01[i] == tab02[j]){

                    System.out.println(j+ ": Jest" );

                }

            }

        }

    }

}
