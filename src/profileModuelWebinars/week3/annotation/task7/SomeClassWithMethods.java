package profileModuelWebinars.week3.annotation.task7;

public class SomeClassWithMethods {
    @ToBeLogged
    public void foo(int a) {
        System.out.println("foo! " + a);
    }

    @ToBeLogged(loglevel = Logger.DEBUG)
    public void bar(int b) {
        System.out.println("bar! " + b);
    }

    //без аннотации
    public void baz(int c) {
        System.out.println("baz! " + c);
    }
}
