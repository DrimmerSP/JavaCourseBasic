package webinares.week8.part3.customcollections;

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

        //Удаляем имена студентов начинающиеся с 'S'
        students.removeIf(element -> (element.charAt(0) == 'S')); //Материал по лямбда выражениям будет изучен в профильном модуле

        System.out.println("Students name Does not start with S");
        // Выводим результирующий лист
        for (String str : students) {
            System.out.println(str);
        }
    }
}
