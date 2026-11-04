package lab01.zadanie4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("ID-001", LocalDate.of(2024, 3, 15), 256.50));
        orders.add(new Order("ID-002", LocalDate.of(2024, 1, 10), 1201.00));
        orders.add(new Order("ID-003", LocalDate.of(2024, 5, 20), 99.99));
        orders.add(new Order("ID-004", LocalDate.of(2024, 2, 1), 454.00));

        System.out.println("Lista początkowa");
        orders.forEach(System.out::println);

        Collections.sort(orders);
        System.out.println("\n1. Posortowane (data)");
        orders.forEach(System.out::println);

        Collections.sort(orders, new AmountComparator());
        System.out.println("\n2. Posortowane (kwota)");
        orders.forEach(System.out::println);
    }
}