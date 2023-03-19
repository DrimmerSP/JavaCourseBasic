package homeworks.profileWork.chapter03.task04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class reflectMethod {
public static Set<Class<?>> getClassInterfaces(Class<?> testClass) {
    Set<Class<?>> result = new HashSet<>();
    if (testClass.getInterfaces().length != 0) {
        result.addAll(Arrays.asList(testClass.getInterfaces()));
        for (Class<?> item : testClass.getInterfaces()) {
            result.addAll(getClassInterfaces(item));
        }
    }
    if (testClass.getSuperclass() != null) {
        result.addAll(getClassInterfaces(testClass.getSuperclass()));
    }
    return result;
}

    public static void main(String[] args) {
        System.out.println(getClassInterfaces(IllegalStateException.class));
        System.out.println(getClassInterfaces(String.class));
        System.out.println(getClassInterfaces(Long.class));
    }
}
