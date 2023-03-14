package webinares.profileModul.week3.annotation.task6;

import webinares.profileModul.week3.annotation.task5.ClassDescription;
import webinares.profileModul.week3.annotation.task5.PerfectClass;

public class ClassDescriptionSaver {
    public static void writeDescription(Class<?> clazz) {
        if (!clazz.isAnnotationPresent(ClassDescription.class)) {
            return;
        }

        ClassDescription classDescription = clazz.getAnnotation(ClassDescription.class);

        System.out.println("Автор: " + classDescription.author());
        System.out.println("Дата создания: " + classDescription.date());
        System.out.println("Текущий номер версии: " + classDescription.currentRevision());

        System.out.println("Список проверяющих (ревьюеров): ");
        for (String name : classDescription.reviewers()) {
            System.out.println("> " + name);
        }
    }

    public static void main(String[] args) {
        writeDescription(PerfectClass.class);
    }
}
