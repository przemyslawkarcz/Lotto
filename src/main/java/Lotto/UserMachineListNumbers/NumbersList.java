package Lotto.UserMachineListNumbers;

public class NumbersList {

    protected void comparesUserNumbersWithRandomOnes (int[][] userNumberArray, int[] machineNumberArray) {

        System.out.println("\n\n* * * Your lucky numbers are: * * *");

        int hitsCounter = 0;



        /*
        for (int i = 0; i < userNumberArray.length; i++) {

            for (int j = 0; j < machineNumberArray.length; j++) {

                if (userNumberArray[i] == machineNumberArray[j]){

                    hitsCounter++;

                    System.out.print(userNumberArray[i] + "|");

                }

            }

        }*/

        if (hitsCounter == 0){

            System.out.println("* * * No hits! * * *");

        }

    }

}
