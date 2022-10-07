package Lotto.RandomNumbers;

public class RandomNumbersFacade {

    public int[] getSixRandomNumbers(){

        RandomNumbers randomNumbers = new RandomNumbers();

        return randomNumbers.generatesSixUniqueRandomNumbers();

    }

}
