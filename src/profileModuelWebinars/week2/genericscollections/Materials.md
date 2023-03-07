# Generics

- **Строгая проверка типов** на этапе компиляции
- Нет информации о типах => универсальный код
- Не нужный явный  **cast**-инг 


```java
List list = new ArrayList<>();
list.add("Hello!");
String s = (String) list.get(0);
```
```java
List<String> list = new ArrayList<>();
list.add("Hello!");
String s = list.get(0);
```



## Generic тип


> Не Generic Версия
```java
public class Box {

    private Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
```

> class name <T1, T2, ..., Tn>
```java
public class Box<T> {
    private T value;

    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
}
```


## Type Naming Convention
- **Одиночные, большие буквы**

_**Наиболее популярные:**_
- E - Element (очень много внутри Java Collections)
- K - Key
- N - Number
- T - Type
- V - Value
- S, U, V, ... - 2-ой, 3-ий, 4-ий типы


## Generic метод

- **Generic метод** - методы со своими параметрами типов
- Действуют только в **пределах метода**
- **Могут использовать статичные/не статичные методы, конструкторы**

```java
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey())
                && p1.getValue().equals(p2.getValue());
    }

    public void test() {
        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(2, "pear");
        boolean same = compare(p1, p2);
    }
```




