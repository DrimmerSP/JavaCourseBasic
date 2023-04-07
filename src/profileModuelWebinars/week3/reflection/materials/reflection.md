# Рефлексия. Reflection API.


**Рефлексия** (от позднелат. _reflexio_ — обращение назад) — это механизм исследования данных о программе во время её выполнения (знание кода о самом себе).

- Рефлексия позволяет исследовать информацию о полях, методах и конструкторах классов.
- Механизм рефлексии позволяет обрабатывать типы, отсутствующие при компиляции, но появившиеся во время выполнения программы. 


<details>
<summary>А что можно сделать?</summary>

- Возможность проитерироваться по всем полям класса

- Найти и создать объект класса, по имени, заданному через текстовую строку
</details>


**Рефлексия** _и наличие логически целостной модели выдачи информации об ошибках дает возможность создавать корректный_ **динамический код**.

<br/>


#### Что позволяет рефлексия?
- Узнать/определить класс объекта;
- Получить информацию о модификаторах класса, полях, методах, константах, конструкторах и суперклассах;
- Выяснить, какие методы принадлежат реализуемому интерфейсу/интерфейсам;
- Создать экземпляр класса, причем имя класса неизвестно до момента выполнения программы;
- Получить и установить значение поля объекта по имени;
- Вызвать метод объекта по имени.

<br/>
<br/>


## Три способа получить объект Class

1. Использовать псевдополе **.class**:
```java
Class<String> cl = String.class;
```
Это специальная конструкция языка, а не настоящее поле.
Её нельзя использовать на **объекте** (экземпляре класса), только на самом **классе**.


<br/>

2. Вызвать метод **getClass()** класса **Object**:
```java
CharSequence seq = "My string";
Class<? extends CharSequence> cl = seq.getClass(); // вернётся Class<String>
```
Этот метод учитывает полиморфизм и возвращает **реальный класс**, которым является объект (экземпляр класса).

<br/>

3. Найти этот класс по строчному имени с помощью статического метода **Class::forName:**

```java
Class<?> integerClass = Class.forName("java.lang.Integer");
```
В случае, если класс с таким именем не найден, будет прошено проверяемое исключение **ClassNotFoundException**:

```java
try {
    Class<?> integerClass = Class.forName("java.lang.Integer");

} catch (ClassNotFoundException ex) {

	System.out.print("Couldn't find the specified class");
}
```

<br/>
<br/>


## Получение имени класса из Class

Имеется несколько методов для получения различных вариантов имени класса:

- `getName()` - Полное имя класса (java.lang.Integer)
- `getSimpleName()` - Короткое имя без пакета (Integer)
- `getPackage().getName()` - Получить только имя пакета (java.lang)
- `getPackageName()` -  Получить только имя пакета (Java 9, можно использовать для примитивных типов)


<br/>
<br/>


## Получение родителей

- Метод `getSuperclass()` возвращает **Class** родителя текущего класса
- Метод `getInterfaces()` возвращает список **Class’ов** интерфейсов, реализуемых текущим классом.

<details><summary> Пример: </summary>

```java
interface A {}
interface B {}
class C implements A {}
class D extends C implements B {}
```

Если запросить и вывести для класса D все интерфейсы метод вернёт только B, т.к. возвращает только то, что указано в описании D. Выше по иерархии не пойдет:

```java
for (Class<?> cls : D.class.getInterfaces()) {
	System.out.println(cls.getName());
}
```

</details>


<br/>
<br/>


## Получение модификаторов класса

Метод `getModifiers()` позволяет узнать все модификаторы, с которыми был объявлен класс:

```java
public native int getModifiers();
```
<br/>

Модификаторы пакуются внутри битов инта, распаковать информацию можно методами класса **Modifier**:

```java
public static boolean isPublic(int mod) { }
public static boolean isPrivate(int mod) { }
public static boolean isProtected(int mod) { }
public static boolean isStatic(int mod) { }
public static boolean isFinal(int mod) { }
public static boolean isInterface(int mod) { }
public static boolean isAbstract(int mod) { }
```


<details><summary> Пример: </summary>

```java
Modifier.isPublic(Main.class.getModifiers())
```

_Тут именно класс Main а не метод_

</details>


<br/>
<br/>


## Работа с полями

Метод `getFields()` возвращает все публичные поля класса или интерфейса, включая унаследованные:

```java
public Field[] getFields() throws SecurityException
```

- Статические поля также возвращаются
- Порядок полей в массиве произвольный

<br/>

Метод `getDeclaredFields()` возвращает вообще все поля класса или интерфейса, но исключая унаследованные:

```java
public Field[] getDeclaredFields() throws SecurityException
```

Есть еще методы: 
- `getField(String name)`  
- `getDeclaredField(String name)`

 позволяют найти поле по его строчному имени.

<br/>

Основные методы класса `Field`:
- `get()` и `set()` позволяют прочитать и записать значение поля:
- `getName()` возвращает имя поля
- `getType()` возвращает объект **Class** для его типа
- `getModifiers()` тоже есть и работает так же, как для **Class**



<br/>
<br/>


## Работа с методами

Методы для получения методов похожи на те, что были для полей:
- `getMethods()` 
- `getDeclaredMethods()` 
- `getMethod()` 
- `getDeclaredMethod()`

Смысл абсолютно тот же, только возвращаются методы

<br/>

**Основные методы класса Method:**
- `getModifiers()`
- `getName()`
- `getDeclaringClass()`

<br/>

## Работа с конструкторами
Аналогично:

- `getConstructors()`
- `getDeclaredConstructors()`
- `getConstructor()`
- `getDeclaredConstructor()`

`@Deprecated` newInstance() - Создаёт новый инстанс класса, вызвав конструктор. 

Использовать: `Class.getDeclaredConstructor(...).newInstance(...)`


