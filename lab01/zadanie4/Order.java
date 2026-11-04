package lab01.zadanie4;
import java.time.LocalDate;

public class Order implements Comparable<Order> {
    private String orderNumber;
    private LocalDate date;
    private double amount;

    public Order(String orderNumber, LocalDate date, double amount) {
        this.orderNumber = orderNumber;
        this.date = date;
        this.amount = amount;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public int compareTo(Order other) {
        return this.date.compareTo(other.date);
    }

    @Override
    public String toString() {
        return String.format("Zamówienie: %-10s | Data: %s | Kwota: %8.2f PLN", orderNumber, date, amount);
    }
}