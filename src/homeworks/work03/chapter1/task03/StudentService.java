package homeworks.work03.chapter1.task03;

import homeworks.work03.chapter1.task02.Student;

import java.util.Arrays;

/**
 * Необходимо реализовать класс StudentService.
 * У класса должны быть реализованы следующие публичные методы:
 * bestStudent() — принимает массив студентов (класс Student из предыдущего задания), возвращает лучшего студента
 * (т.е. который имеет самый высокий средний балл). Если таких несколько — вывести любого.
 * sortBySurname() — принимает массив студентов (класс Student из предыдущего задания) и сортирует его по фамилии.
 */
public class StudentService {
    public Student bestStudent(Student[] students){
        double hiGrade = 0;
        int valStud = 0;
        for (int i = 0; i < students.length; i++) {
            if (hiGrade < students[i].averGrades()){
                hiGrade = students[i].averGrades();
                valStud = i;
            }
        }
        return students[valStud];
    }

    public Student[] sortBySurname(Student[] students){
        Arrays.sort(students);
        return students;
    }
}
