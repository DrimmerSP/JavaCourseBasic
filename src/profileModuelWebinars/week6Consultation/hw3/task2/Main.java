package profileModuelWebinars.week6Consultation.hw3.task2;


import week6.consultation.hw3.task1.IsLike;

/*
Написать метод, который рефлексивно проверит наличие аннотации @IsLike на любом переданном классе и выведет значение,
хранящееся в аннотации, на экран.
 */
public class Main {
    public static void main(String[] args) {
        check(LikeClass.class);
        check(NotLikeClass.class);
        check(SimpleClass.class);
    }
    
    public static void check(Class<?> cls) {
        if (!cls.isAnnotationPresent(IsLike.class)) {
            System.out.println("Annotation not found");
            return;
        }
        IsLike isLike = cls.getAnnotation(IsLike.class);
        System.out.println("IsLike: " + isLike.value());
    }
    
}
