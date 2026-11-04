package lab01.zadanie2;

import java.util.Comparator;

public class WeightAscendingComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        return Double.compare(a1.getWeight(), a2.getWeight());
    }
}
