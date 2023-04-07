package profileModuelWebinars.week3.annotation.task7;

public class Main {
    public static void main(String[] args) {
        SomeClassWithMethods instance = new SomeClassWithMethods();

        LoggingService.log(instance, "foo");
        instance.foo(1);

        LoggingService.log(instance, "bar");
        instance.bar(2);

        LoggingService.log(instance, "baz");
        instance.baz(3);
    }

}
