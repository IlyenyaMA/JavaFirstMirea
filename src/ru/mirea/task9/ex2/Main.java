package ru.mirea.task9.ex2;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Влад", 90),
                new Student("Миша", 95),
                new Student("Алексей", 99),
                new Student("Илья", 100),
                new Student("Николай", 1)
        };

        java.util.Arrays.sort(students, new SortingStudentsByGPA());

        System.out.println("Список студентов, отсортированный по убыванию баллов:");
        for (Student student : students) {
            System.out.println("Имя: " + student.getName() + ", Итоговый балл: " + student.getGpa());
        }
    }
}