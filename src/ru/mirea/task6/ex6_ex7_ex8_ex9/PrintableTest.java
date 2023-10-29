package ru.mirea.task6.ex6_ex7_ex8_ex9;

public class PrintableTest {
    public static void main(String[] args) {
        Book book1 = new Book("Book1");
        Book book2 = new Book("Book2");
        Shop shop1 = new Shop("One");
        Shop shop2 = new Shop("Two");
        Printable[] printables = {book1, book2, shop1, shop2};
        for(Printable printable: printables){
            printable.print();
        }
    }
}