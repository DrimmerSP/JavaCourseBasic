# Annotation / Аннотации 

### Определение
**Аннотации** - это форма метаданных. Они предоставляют информацию о программе, при том сами частью программы не являются.

**Применение:**
- Информация для компилятора. Могут использоваться компилятором для обнаружения ошибок и подавления предупреждений.
- Обработка во время компиляции и развертывания. Программа может создавать код, XML-файлы и т.п. на основе аннотаций.
- Обработка во время выполнения. Некоторые аннотации могут использоваться во время выполнения программы.

<br/>


### Стандартные аннотации

## `@Deprecated`

Аннотация `@Deprecated` используется для пометки устаревших методов или типов.
IDE автоматически обрабатывают эту аннотацию и обычно отображают устаревший метод зачеркнутым шрифтом, сообщая разработчику, что больше не следует его использовать.

<br/>

## `@Override`

Она используется для проверки переопределенных методов во время компиляции на такие ошибки, как опечатки в регистре символов и существование метода.

<br/>

## `@SuppressWarnings`

Аннотация `@SuppressWarnings` используется для подавления предупреждений компилятора. Например, `@SuppressWarnings("unchecked")` отключает  предупреждения, связанные с "сырыми" типами **(Raw Types)**. 

<br/>
<br/>

### Аннотации, применимые к другим аннотациям (мета-аннотации)
Располагаются в пакете `java.lang.annotation`.

## `@Retention`

_Указывает, сколько хранится отмеченная аннотация:_

`RetentionPolicy.SOURCE` - Отмеченная аннотация сохраняется только на уровне исходного кода и игнорируется компилятором. (Например, `@SuppressWarnings` и `@Override`)

<br/>

`RetentionPolicy.CLASS` - Сохраняется компилятором во время компиляции, но **игнорируется JVM**. 

<br/>

`RetentionPolicy.RUNTIME` - Сохраняется JVM для использования во время выполнения программы. (Например,  @Deprecated)

<br/>

## `@Documented`

**Указывает**, что аннотация, должна быть задокументирована в **Javadoc** (по умолчанию аннотации не документируются).

<br/>

## `@Target`

Определяет **права доступа** аннотации (к каким элементам ее можно применять). 

В аннотации `@Target` указывается одно из следующих значений:
- `ElementType.ANNOTATION_TYPE`. Применяется к аннотации
- `ElementType.CONSTRUCTOR`. Применяется к конструктору.
- `ElementType.FIELD`. Применяется к полю или свойству.
- `ElementType.LOCAL_VARIABLE`. Применяется к локальной переменной.
- `ElementType.METHOD`. Применяется к методу.
- `ElementType.PARAMETER`. Применяется к параметру метода.
- `ElementType.TYPE`. Применяется к любому элементу класса


<br/>

## `@Inherited`
Аннотация будет наследоваться дочерним классом (по умолчанию аннотации **не наследуются**). 

Применима только к описаниям классов.


## `@Repeatable`
Указывает, что аннотация повторяющаяся.

То есть одну и ту же аннотацию можно несколько раз применять к одному **target** (к классу, например)

<br/>
<br/>

### Типы аннотаций


- **Маркерные аннотации** 

  
  Маркерные аннотации не содержат никаких членов или данных. 

<br/>

- **Аннотации с одним значением**
  
  Аннотации с одним значением содержат только один атрибут, который принято называть **value** 

<br/>


- **Аннотации с несколькими значениями**

  Они состоят из нескольких пар **"имя-значение"**. 

<br/>
<br/>

## Зачем создавать свои аннотации?
1. Пассивная документация кода.
   Как правило это маркерные аннотации без содержания дополнительной логики.
1. Для того, чтобы реализовать какую-либо логику используя **Java Reflection**.
1. Либо изучить компилятор java и писать что-то похожее на Override, например :) 

<br/>

## Обращение к аннотации с помощью Reflection
Для проверки наличия аннотации у класса, существуют методы класса **Class**:

`isAnnotationPresent()` - 
Проверяет, есть ли у класса данная аннотация

`getAnnotation()` - 
Возвращает аннотацию, если она есть у класса, иначе null

`getAnnotations()` - 
Возвращает все аннотации, примененные к классу

`getDeclaredAnnotations()` - 
Как предыдущий, но не учитывает аннотации, унаследованные с помощью `@Inherited`