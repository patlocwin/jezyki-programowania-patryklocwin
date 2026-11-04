package lab01.zadanie2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Pies", 5, 22.0));
        animals.add(new Animal("Kot", 3, 4.7));
        animals.add(new Animal("Pies", 2, 15.0));
        animals.add(new Animal("Słoń", 12, 3500.0));
        animals.add(new Animal("Kot", 1, 6.2));
        animals.add(new Animal("Papuga", 4, 1.4));

        System.out.println("1. Lista początkowa");
        animals.forEach(System.out::println);

        Collections.sort(animals, new SpeciesThenAgeComparator());

        System.out.println("\n2. Posortowane: gatunek (A-Z) -> wiek (rosnąco)");
        animals.forEach(System.out::println);

        Collections.sort(animals, new WeightAscendingComparator());

        System.out.println("\n3. Posortowane: waga (od najlżejszego do najcięższego)");
        animals.forEach(System.out::println);
    }
}