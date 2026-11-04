package lab01.zadanie1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<User> users = new HashSet<>();

        User user1 = new User(1L, "jan_k", "jan.kowalski@example.com");
        User user2 = new User(1L, "jan_nowy", "inny_mail@example.com");
        User user3 = new User(2L, "anna_n", "anna.nowak@example.com");
        User user4 = new User(3L, "piotr_z", "piotr.zielinski@example.com");

        System.out.println("Dodano user1 (ID: 1): " + users.add(user1));
        System.out.println("Dodano user2 (ID: 1): " + users.add(user2));
        System.out.println("Dodano user3 (ID: 2): " + users.add(user3));
        System.out.println("Dodano user4 (ID: 3): " + users.add(user4));

        System.out.println("\nRozmiar zbioru: " + users.size());

        System.out.println("\nZawartość zbioru:");
        for (User user : users) {
            System.out.println(user);
        }
    }
}