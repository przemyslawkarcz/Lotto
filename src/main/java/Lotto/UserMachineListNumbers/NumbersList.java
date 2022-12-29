package Lotto.UserMachineListNumbers;

public class NumbersList {

    protected void comparesUserNumbersWithRandomOnes (int[][] userNumberArray, int[] machineNumberArray) {

        System.out.println("\n\n* * * Your lucky numbers are: * * *");

        for (int i = 0; i < userNumberArray.length; i++) {

            int hitsCounter = 0;

            System.out.print("Bet " + (i + 1) + ": (");

            for (int j = 0; j < userNumberArray[i].length; j++) {

                for (int k = 0; k < machineNumberArray.length; k++) {

                    if (userNumberArray[i][j] == machineNumberArray[k]) {

                        hitsCounter++;
                        System.out.print(machineNumberArray[k] + ", ");

                    }

                }

            }

            System.out.println(") -" + hitsCounter + " hit/s: ");

        }

    }

}
