package lab01.zadanie5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataGenerator {
    private final Random random = new Random();
    public List<Integer> generateRandomNumbers(int count) {
        List<Integer> numbers = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            numbers.add(random.nextInt());
        }
        return numbers;
    }
    public int getRandomNumber(int bound) {
        return random.nextInt(bound);
    }
}