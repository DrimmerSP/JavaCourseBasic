package homeworks.work03.chapter1.task02;

/**
 * Необходимо реализовать класс Student.
 * У класса должны быть следующие приватные поля:
 * String name — имя студента
 * String surname — фамилия студента
 * int[] grades — последние 10 оценок студента.
 * Их может быть меньше, но не может быть больше 10.
 * И следующие публичные методы:
 * геттер/сеттер для name
 * геттер/сеттер для surname
 * геттер/сеттер для grades
 * метод, добавляющий новую оценку в grades.
 * Самая первая оценка должна быть удалена,
 * новая должна сохраниться в конце массива
 * (т.е. массив должен сдвинуться на 1 влево).
 * Метод, возвращающий средний балл студента
 * (рассчитывается как среднее арифметическое от всех оценок в
 * массиве grades)
 */
public class Student implements Comparable<Student>{
    String name = "";
    String surName = "";
    int[] grades = new int[10];



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public void addNewGrade(int num) {
        int[] array = new int[grades.length];
        for (int i = 0; i < grades.length - 1; i++) {
            array[i] = grades[i + 1];
        }
        array[array.length - 1] = num;
        grades = array;
    }

    public double averGrades() {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] != 0) {
                count++;
            }
            sum += grades[i];
        }
        return (sum * 1.0) / count;
    }

    @Override
    public int compareTo(Student o) {
        return this.getSurName().compareTo(o.getSurName());
    }
}
