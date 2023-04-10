package profileModuelWebinars.week6Consultation.hw3.task4;

import profileModuelWebinars.week6Consultation.hw3.task4.structure.Z;

import java.util.ArrayList;
import java.util.List;


/*
    Написать метод, который с помощью рефлексии получит все интерфейсы
    класса, включая интерфейсы от классов-родителей и интерфейсов-родителей.
 */
public class Main {
    public static void main(String[] args) {
        List<Class<?>> allInterfaces = getAllInterfaces2(Z.class);
        for (Class<?> value : allInterfaces) {
            System.out.println(value);
        }
    }


    public static List<Class<?>> getAllInterfaces(Class<?> cls) {
        List<Class<?>> interfaces = new ArrayList<>();
        while (cls != Object.class) {
            for (Class<?> anInterface : cls.getInterfaces()) {
                interfaces.add(anInterface);
                Class<?>[] arrayInterface = anInterface.getInterfaces();
                while (arrayInterface.length > 0) {
                    for (Class<?> elementInterface : arrayInterface) {
                        anInterface = elementInterface;
                        interfaces.add(anInterface);
                        arrayInterface = anInterface.getInterfaces();
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return interfaces;
    }


    public static List<Class<?>> getAllInterfaces2(Class<?> cls) {
        if (cls == null) {
            return null;
        } else {
            List<Class<?>> interfaces = new ArrayList<>();
            getAllInterfacesOfParents(cls, interfaces);
            return interfaces;
        }
    }


    private static void getAllInterfacesOfParents(Class<?> cls, List<Class<?>> interfacesFound) {
        while (cls != null) {
            Class<?>[] interfaces = cls.getInterfaces();
            for (Class<?> anInterface : interfaces) {
                if (!interfacesFound.contains(anInterface)) {
                    interfacesFound.add(anInterface);
                    getAllInterfacesOfParents(anInterface, interfacesFound);
                }
            }
            cls = cls.getSuperclass();
        }
    }
}
