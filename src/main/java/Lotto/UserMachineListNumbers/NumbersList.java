package Lotto.UserMachineListNumbers;

public class NumbersList {

    protected int comparesUserNumbersWithRandomOnes (int[][] userNumberArray, int[] machineNumberArray) {

        System.out.println("\n\n* * * Your lucky numbers are: * * *");

        int hitsCounter = 0;

        for (int i = 0; i < userNumberArray.length; i++) {

            hitsCounter = 0;

            System.out.print("Bet " + (i + 1) + ": (");

            for (int j = 0; j < userNumberArray[i].length; j++) {

                for (int k = 0; k < machineNumberArray.length; k++) {

                    if (userNumberArray[i][j] == machineNumberArray[k]) {

                        hitsCounter++;
                        System.out.print(machineNumberArray[k] + ", ");

                    }

                }

            }

            System.out.println(") -> " + hitsCounter + " hit/s: ");

        }

        return hitsCounter;
    }

}
