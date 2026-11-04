package lab01.zadanie2;

import java.util.Comparator;

public class SpeciesThenAgeComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        int speciesComparison = a1.getSpecies().compareTo(a2.getSpecies());

        if (speciesComparison != 0) {
            return speciesComparison;
        }

        return Integer.compare(a1.getAge(), a2.getAge());
    }
}
