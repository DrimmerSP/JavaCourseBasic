package week3.reflection.task4;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
    Сконструировать класс. То есть вызвать конструктор класса и обработать все возможные ошибки.
 */
public class Main {
    public static void main(String[] args) {
        Class<Task4> clazz = Task4.class;

        try {
            Constructor<Task4> constructor = clazz.getDeclaredConstructor(int.class, String.class);
            Task4 instance = constructor.newInstance(142, "ABC");

            System.out.println(instance);
            System.out.println();
            System.out.println(instance.a);
            System.out.println(instance.b);

        } catch (NoSuchMethodException ex) {
            System.out.println("No such method");
        } catch (IllegalAccessException ex) {
            System.out.println("The method access modifiers forbid calling it");
        } catch (IllegalArgumentException ex) {
            System.out.println("Incorrect arguments given!");
        } catch (InvocationTargetException ex) {
            System.out.println("The method has throw an exception");
        } catch (InstantiationException ex) {
            System.out.println("Class is abstract");
        }
    }
}

