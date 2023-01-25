package week7.task6;

/*
Реализовать простой Design Pattern Singleton двух типов:

- Lazy loading (ленивая/отложенная загрузка) — создание экземпляра по требованию.
- Eager loading (нетерпеливая/ранняя загрузка) — ранняя загрузка, создание экземпляра при инициализации.

 */
//https://poltora.info/ru/blog/vse-chto-vi-hoteli-znat-o-singleton/
public class LazySingleton {
    private static LazySingleton INSTANCE;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }



}
