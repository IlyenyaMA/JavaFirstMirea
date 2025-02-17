package ru.mirea.task6.ex6_ex7_ex8_ex9;

public class Book implements Printable {

    private String name;

    public Book(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print(){
        System.out.println("Name of the book:" + getName());

    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}