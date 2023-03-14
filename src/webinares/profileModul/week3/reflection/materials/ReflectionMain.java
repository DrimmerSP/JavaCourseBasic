package webinares.profileModul.week3.reflection.materials;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Objects;

public class ReflectionMain {
    public static void main(String[] args) {
        //Три способа получить объект Class
//        classExample();

        //Получение имени класса из Class
//        getClassName();

        //Получение модификаторов класса
//        getClassModifiers();

        //Работа с полями
//        getFieldsAndDeclaredFields();

        //Работа с методами
        getMethodsAndDeclaredMethods();
    }

    public static void classExample() {
        //1
        Class<String> clazz = String.class;
        System.out.println("1: " + clazz);

        //2
        Integer num = 3;
        Class<? extends Number> clazz2 = num.getClass();
        System.out.println("2: " + clazz2);

        //3
        try {
            Class<?> integerClass = Class.forName("java.lang.Integer");
            System.out.println("3: " + integerClass);

            Class<?> unknownClass = Class.forName("java.lang.unknownClass");
        } catch (ClassNotFoundException ex) {
            System.out.print("Couldn't find the specified class");
        }
    }

    public static void getClassName() {
        Class<Integer> intClass = int.class;
        Class<Integer> integerClass = Integer.class;

        System.out.println(intClass.getName());
        System.out.println(intClass.getCanonicalName());
        System.out.println(intClass.getSimpleName());

//        System.out.println(intClass.getPackage().getName()); //NPE
        System.out.println(intClass.getPackageName());

        System.out.println("\n" + integerClass.getName());
        System.out.println(integerClass.getCanonicalName());
        System.out.println(integerClass.getSimpleName());

        System.out.println(integerClass.getPackage().getName());
        System.out.println(integerClass.getPackageName());
    }

    public static void getClassModifiers() {
        System.out.println(Modifier.isPublic(ReflectionMain.class.getModifiers()));
    }


    public static void getFieldsAndDeclaredFields() {
        TestClass classInstance = new TestClass();

        //Get Fields
        localPrint(classInstance.getClass().getFields()); //get public fields
        localPrint(classInstance.getClass().getDeclaredFields()); //get all declared fields

        try {
            localPrint(classInstance.getClass().getField("count"));
            localPrint(classInstance.getClass().getDeclaredField("name"));

            localPrint(classInstance.getClass().getDeclaredField("unknown"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void getMethodsAndDeclaredMethods() {
        TestClass classInstance = new TestClass();

        //Get Methods
        localPrint(classInstance.getClass().getMethods());
        localPrint(classInstance.getClass().getDeclaredMethods());

        try {
            Method method = classInstance.getClass().getDeclaredMethod("printHello", String.class);
            method.setAccessible(true);
            method.invoke(classInstance, "Denis");
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    public static void localPrint(Object obj) {
        localPrint(new Object[]{obj});
    }

    public static void localPrint(Object[] array) {
        String header = "";
        if (!Objects.isNull(array)) {
            header = array[0] instanceof Field ? "Fields: " : "Methods";
        }

        System.out.println(header);
        System.out.println("------------------------------------------------------------------------");
        for (Object obj : array) {
            System.out.println(obj);
        }
        System.out.println("------------------------------------------------------------------------\n");


    }
}
