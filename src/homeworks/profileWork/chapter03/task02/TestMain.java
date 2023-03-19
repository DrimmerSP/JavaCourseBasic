package homeworks.profileWork.chapter03.task02;

import homeworks.profileWork.chapter03.task01.IsLike;
import homeworks.profileWork.chapter03.task01.MyClass;

public class TestMain {
    public static void mainTest(Class<?> myClass){
       if (!myClass.isAnnotationPresent(IsLike.class)){
           System.out.println("Нет аннотации @IsLike у переданного класса");
           return;
       }
        IsLike isLike = myClass.getAnnotation(IsLike.class);
        System.out.println(isLike.value());
    }

    public static void main(String[] args) {
        mainTest(MyClass.class);
        mainTest(args.getClass());
        mainTest(String.class);
    }
}
