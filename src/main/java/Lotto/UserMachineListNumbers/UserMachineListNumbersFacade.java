package Lotto.UserMachineListNumbers;

public class UserMachineListNumbersFacade {

    public void getResultsOfDraw (int[] userNumberArray, int[] machineNumberArray){

        NumbersList numbersList = new NumbersList();
        numbersList.comparesUserNumbersWithRandomOnes(userNumberArray, machineNumberArray);

    }

}
