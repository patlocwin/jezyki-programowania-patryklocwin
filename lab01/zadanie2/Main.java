package lab01.zadanie2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Pies", 5, 22.0));
        animals.add(new Animal("Kot", 3, 4.5));
        animals.add(new Animal("Pies", 2, 15.0));
        animals.add(new Animal("Słoń", 12, 3500.0));
        animals.add(new Animal("Kot", 1, 3.2));
        animals.add(new Animal("Papuga", 4, 1.1));

        System.out.println("1. LISTA POCZĄTKOWA");
        animals.forEach(System.out::println);

        Comparator<Animal> speciesThenAgeComparator = Comparator
                .comparing(Animal::getSpecies)
                .thenComparingInt(Animal::getAge);

        animals.sort(speciesThenAgeComparator);

        System.out.println("\n2. POSORTOWANE: GATUNEK (A-Z) -> WIEK (rosnąco)");
        animals.forEach(System.out::println);

        Comparator<Animal> weightAscendingComparator = Comparator
                .comparingDouble(Animal::getWeight);

        animals.sort(weightAscendingComparator);

        System.out.println("\n3. POSORTOWANE: WAGA (od najlżejszego do najcięższego)");
        animals.forEach(System.out::println);
    }
}