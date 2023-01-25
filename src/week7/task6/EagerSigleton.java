package week7.task6;

// https://poltora.info/ru/blog/vse-chto-vi-hoteli-znat-o-singleton/
public class EagerSigleton {
    private static final EagerSigleton INSTANCE = new EagerSigleton();
    private EagerSigleton() {}

    public static EagerSigleton getINSTANCE() {
        return INSTANCE;
    }
}
