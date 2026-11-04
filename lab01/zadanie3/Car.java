package lab01.zadanie3;

import java.util.Objects;

public class Car {
    private final String make;
    private final String model;
    private final String registrationNumber;

    public Car(String make, String model, String registrationNumber) {
        this.make = make;
        this.model = model;
        this.registrationNumber = registrationNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(registrationNumber, car.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrationNumber);
    }

    @Override
    public String toString() {
        return "Car{" + "make='" + make + '\'' + ", model='" + model + '\'' + ", registrationNumber='" + registrationNumber + '\'' + '}';
    }
}