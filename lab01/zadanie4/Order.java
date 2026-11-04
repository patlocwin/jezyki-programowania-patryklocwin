package lab01.zadanie4;

import java.time.LocalDate;
import java.util.Objects;

public class Order implements Comparable<Order> {
    private final String orderNumber;
    private final LocalDate date;
    private final double amount;

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
        int dateComparison = this.date.compareTo(other.date);
        if (dateComparison != 0) {
            return dateComparison;
        }
        return this.orderNumber.compareTo(other.orderNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return Objects.equals(orderNumber, order.orderNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber);
    }

    @Override
    public String toString() {
        return String.format("Zamówienie: %-10s | Data: %s | Kwota: %8.2f PLN", orderNumber, date, amount);
    }
}
