package week3.reflection.task2;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
    Вывести все поля класса, их модификаторы и типы.
 */
public class Main {

    public static void printAllFields(Class<?> clazz) {
        for (Field field : clazz.getDeclaredFields()) {
            int mods = field.getModifiers();
            if (Modifier.isPublic(mods)) System.out.print("public ");
            if (Modifier.isProtected(mods)) System.out.print("protected ");
            if (Modifier.isPrivate(mods)) System.out.print("private ");
            if (Modifier.isStatic(mods)) System.out.print("static ");
            if (Modifier.isFinal(mods)) System.out.print("final ");

            System.out.println(field.getType().getCanonicalName() + ' ' + field.getName());
        }
    }

    public static void main(String[] args) {
        printAllFields(Task2.class);
    }
}
