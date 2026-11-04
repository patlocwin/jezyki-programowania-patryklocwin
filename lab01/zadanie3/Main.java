package lab01.zadanie3;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Car> cars = new HashSet<>();

        Car car1 = new Car("Toyota", "Yaris", "DXI3D7Z");
        Car car2 = new Car("Ford", "Fiesta", "DXI3D7Z");
        Car car3 = new Car("Toyota", "Yaris", "DXI3D7Z");

        Car car4 = new Car("BMW", "X3", "KR87JK5");
        Car car5 = new Car("Audi", "A7", "WPR98JE3");

        System.out.println("Dodawanie aut do hashSet");
        System.out.println("Dodawanie car1 (Toyota, DXI3D7Z): " + cars.add(car1));
        System.out.println("Dodawanie car2 (Ford, DXI3D7Z):   " + cars.add(car2));
        System.out.println("Dodawanie car3 (Toyota, DXI3D7Z): " + cars.add(car3));
        System.out.println("Dodawanie car4 (BMW, KR87JK5):     " + cars.add(car4));
        System.out.println("Dodawanie car5 (Audi, WPR98JE3):    " + cars.add(car5));

        System.out.println("\nWszystkie auta w HashSet: " + cars.size());

        System.out.println("\nAuta:");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}