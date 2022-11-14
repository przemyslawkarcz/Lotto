package Lotto.UserMachineListNumbers;

import Lotto.Inspect.ExceptionChecksIntegerFormat;
import Lotto.RandomNumbers.RandomNumbersFacade;
import Lotto.UserDataInput.UserDataInputFacade;

public class NumbersList {

    public static void main(String[] args) {

        int[] int01 = new int[]{1, 2, 3, 4};
        int[] int02 = new int[]{4, 5, 6, 7, 8,};

        comparesUserNumbersWithRandomOnes(int01, int02);

    }

    protected static void comparesUserNumbersWithRandomOnes (int[] userNumberArray, int[] machineNumberArray) {

        for (int i = 0; i < userNumberArray.length; i++) {

            for (int j = 0; j < machineNumberArray.length; j++) {

                if (userNumberArray[i] == machineNumberArray[j]){

                    System.out.println("Jest, pod indeksem: " + i);
                    // 14.11.2022 tu skonczylem
                }

            }

        }

    }

}
