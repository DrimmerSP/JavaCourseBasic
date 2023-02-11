package webinares.week9.part1.arraylistexample;

import java.util.ArrayList;

public class RemoveIfExample {
    public static void main(String[] args) {
        //Инициализируем ArrayList
        ArrayList<String> students = new ArrayList<>();

        students.add("Maria");
        students.add("Sofia");
        students.add("Denis");
        students.add("Sergey");
        students.add("Petr");
        // Выводим исходный список
        System.out.println("Students List:");
        students.forEach(System.out::println);
        System.out.println();


        //Удаляем имена студентов начинающиеся с 'S'
        students.removeIf(element -> (element.charAt(0) == 'S')); //Материал по лямбда выражениям будет изучен в профильном модуле

        System.out.println("Students name Does not start with S");
        // Выводим результирующий список
        students.forEach(System.out::println);

    }
}
