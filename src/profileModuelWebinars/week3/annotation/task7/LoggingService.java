package profileModuelWebinars.week3.annotation.task7;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.time.LocalDateTime;

public class LoggingService {

    public static void log(Object obj, String methodName) {
        Class<?> clazz = obj.getClass();

        for (Method method : clazz.getMethods()) {
            if (method.getName().equals(methodName)) {
                for (Annotation annotation : method.getAnnotations()) {
                    if (annotation instanceof ToBeLogged lmc) {
                        switch (lmc.loglevel()) {
                            case INFO ->
                                    System.out.println("[INFO] Logging method: " + method.getName());
                            case DEBUG ->
                                    System.out.println("[DEBUG] Logging method: " + method.getName() + " at time: " + LocalDateTime.now());
                        }
                    }
                }
                break;
            }
        }
    }
}
