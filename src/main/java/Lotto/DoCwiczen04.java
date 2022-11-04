package Lotto;

import java.util.Scanner;

public class DoCwiczen04 {

    public static void main(String[] args) {

        method();

    }

    public static void method(){

        Scanner scanner = new Scanner(System.in);

        int [] tab01 = new int[]{0, 0, 0};
        int [] tab02;

        //wydruk tab przed wypełnieniem
        for (int x:tab01) {
            System.out.print(x + "|");
        }

        System.out.println();
        for (int i = 0; i < tab01.length; i++) {

            tab02 = tab01;

            System.out.println("tab02[" + i + "]: " + tab02[i]);

            tab01[i] = scanner.nextInt();

            //xxxxxxxxxxxxxx

            System.out.println("tab01[" + i + "]: " + tab01[i]);

            for (int x:tab01) {
                System.out.print(x + "||");
            }
            System.out.println("\nkolejny obrót pętli");

        }

        //wydruk tab po wypełnieniu
        System.out.println();
        for (int x:tab01) {
            System.out.print(x + "|||");
        }



    }

}
