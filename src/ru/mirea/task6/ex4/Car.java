package ru.mirea.task6.ex4;

public class Car implements Priceable {
    private String brand;
    private double price;

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}