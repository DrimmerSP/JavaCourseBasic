package profileModuelWebinars.week3.reflection.task1;

import webinares.profileModul.week3.reflection.task1.structure.D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Получить все интерфейсы класса, включая интерфейсы от классов-родителей.
Не включать интерфейсы родительских интерфейсов.
 */
public class Task1 {
    public static List<Class<?>> getAllInterfaces(Class<?> clazz) {
        List<Class<?>> interfaces = new ArrayList<>();
        while (clazz != Object.class) {
            interfaces.addAll(Arrays.asList(clazz.getInterfaces()));
            clazz = clazz.getSuperclass();
        }
        return interfaces;
    }

    public static void main(String[] args) {
        List<Class<?>> interfaces = getAllInterfaces(D.class);
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getName());
        }
    }

}
