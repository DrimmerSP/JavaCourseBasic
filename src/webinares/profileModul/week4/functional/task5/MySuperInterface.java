package webinares.profileModul.week4.functional.task5;

@FunctionalInterface
public interface MySuperInterface<T> {
    T func(T value);
    default T func1(T value) {
        return value;
    }
}
