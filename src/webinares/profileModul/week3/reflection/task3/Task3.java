package webinares.profileModul.week3.reflection.task3;

import webinares.profileModul.week3.reflection.task2.Task2;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
    Продолжение задачи 2. Создать экземпляр (инстанс) класса Task2 вывести значения его полей.
 */
public class Task3 {

    public static void printAllFieldsWithValues(Class<?> clazz, Object instance) throws IllegalAccessException {
        for (Field field : clazz.getDeclaredFields()) {
            int mods = field.getModifiers();
            if (Modifier.isPublic(mods)) System.out.print("public ");
            if (Modifier.isProtected(mods)) System.out.print("protected ");
            if (Modifier.isPrivate(mods)) System.out.print("private ");
            if (Modifier.isStatic(mods)) System.out.print("static ");
            if (Modifier.isFinal(mods)) System.out.print("final ");

            field.setAccessible(true);

            System.out.println(field.getType().getCanonicalName() + ' ' + field.getName() + ' ' + field.get(instance));
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        Task2 task2Instance = new Task2();
        task2Instance.setI(777);
        printAllFieldsWithValues(task2Instance.getClass(), task2Instance);

    }
}
