package ru.mirea.task20.Number23;

import ru.mirea.task20.Number1.TripleGenericClass;
import ru.mirea.task6.ex3.Animal;

public class Main {
    public static void main(String[] args) {
        Integer integerVar = 10;
        Animal catVar = new Animal("Bob");
        String stringVar = "Hello";

        TripleGenericClass<Integer, Animal, String> triple = new TripleGenericClass<>(integerVar, catVar, stringVar);
        triple.printClassNames();
    }
}