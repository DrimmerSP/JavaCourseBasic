package Week3;

public class RegExpTheory {

 /*
    1) Поиск текста:
    Текст: Java, java, java, program
    regexp: java
    Регулярные выражения регистрозависимые!
    заранее заданный текст, статический.

    2) Поиск любого символа:
    . — найдет любой символ (один).
    Regex: А.я
     Текс:
    Аня
    Ася
    Оля
    Аля
    Валя

    А.я - начало на А, любой символ и окончание на я



    Точка найдет и точку.
     Regex: file.
    file.txt
    file1.txt
    file2.xls

    Найти все файлы с расширением .txt:
    Regexp: .txt
    Экранирование!!!
    Regexp: \.txt

    . - любой символ
    \. - точка

    3) Поиск по набору символов
    Мы хотим найти имена Алла, Анна в списке.
    Можем попробовать через точку (две) , но ....
    Regexp: A..a
    Анна
    Алла
    аоикА74арплт
    Аркан
    А^&а
    Абба

    Если мы хотим ограничить наш поиск, то нужно использовать диапазоны допустимых значений.
    Ставим квадратные скобки, внутри перечисляем нужные нам символы:
    Regexp: А[нн][нл]а
    [нл] — только «н» и «л»
    [а-я] — все русские буквы в нижнем регистре от «а» до «я» (кроме «ё»)
    [А-Я]    — все заглавные русские буквы
    [А-Яа-яЁё]  — все русские буквы
    [a-z]  — латиница мелким шрифтом
    [a-zA-Z]  — все английские буквы
    [0-9]  — любая цифра
    [В-Ю]   — буквы от «В» до «Ю» (да, диапазон — это не только от А до Я)
    [А-ГО-Р]   — буквы от «А» до «Г» и от «О» до «Р»

    От одного до трех, и цифра 1.
    [1-31]

    4) Исключения
    ^ внутри [] означает исключение
    [^0-9]  — любой символ, кроме цифр
    [^ёЁ]  — любой символ, кроме буквы «ё»
    [^а-в8]  — любой символ, кроме букв «а», «б», «в» и цифры 8

    Regexp:[^0-9]\.txt
    file.txt
    log.txt
    file_1.txt
    1.txt

    Regexp: fruits\[[0-9]\]
    fruits[0] = “апельсин”;
    fruits[1] = “яблоко”;
    fruits[2] = “лимон”;
    fruits[«любое однозназначное число»]

    5) Перечисление вариантов
    Квадратные скобки [] помогают перечислить варианты для одного символа.
    Если же мы хотим перечислить слова, то лучше использовать вертикальную черту — |.

    regexp: Оля|Олечка|Котик
    Оля Олечка Оля Кот Котик
    Можно использовать вертикальную черту и для одного символа.
    Можно даже внутри слова — тогда вариативную букву берем в круглые скобки
    Regex: А(н|л)я
    Настя
    Аня
    Аля
    Оля
    Катя

Круглые скобки обозначают группу символов.
В этой группе у нас или буква «н», или буква «л». Зачем нужны скобки?
Показать, где начинается и заканчивается группа.
Иначе вертикальная черта применится ко всем символам — мы будем искать или «Ан», или «ля»:

Пример:
А(н|л)я
А[нл]я
Эти 2 варианта вернут одно и то же

6) Метасимволы
Если мы хотим найти число, то пишем диапазон [0-9].
Если букву, то [а-яА-ЯёЁa-zA-Z].
В регулярных выражениях используются специальные метасимволы,
которые заменяют собой конкретный диапазон значений:

Символ  Эквивалент  Пояснение
   \d   [0-9]       Цифровой символ
   \D   [^0-9]      Нецифровой символ
   \s   [ \f\n\r\t\v]   Пробельный символ
   \S   [^ \f\n\r\t\v] Непробельный символ
   \w   [[:word:]]      Буквенный или цифровой символ или знак подчёркивания
   \W   [^[:word:]]     Любой символ, кроме буквенного или цифрового символа или знака подчёркивания

мы хотим поработать с датами
dd.mm.yyyy - формат даты
11.10.1990
11.56.asdf
aa.23.18hf

regexp: [0-9][0-9]\.[0-9][0-9]\.[0-9][0-9][0-9][0-9]
\d\d\.\d\d\.\d\d\d\d

7) Спецсимволы
Большинство символов в регулярном выражении представляют сами себя за исключением специальных символов:
[ ] \ / ^ $ . | ? * + ( ) { }

8) Квантификаторы (количество повторений)
Символ «+» означает «одно или более повторений»
Какие есть квантификаторы, кроме знака «+»?
? - Ноль или одно
* - Ноль или более
+ - Один или более
.* - любой символ 0 или более раз

Regex: (Хихи)*(Хаха)*
ХихиХаха
ХихиХихиХихи
Хихи
Хаха
ХихиХихиХахаХахаХаха

email:
test@mail.ru
olga31@gmail.com
Regexp: \w+@\w+\.\w+

А что, если мне нужно определенное количество повторений?
Чтобы указать конкретное количество повторений, их надо записать внутри фигурных скобок:

{n} - Ровно n раз
{m,n} - От m до n включительно
{m,} - Не менее m
{,n} - Не более n
Не забывайте — квантификатор применяется к последнему символу!
Regexp: data{2} - нужно (data){2}
dataa
datadata

Regex: <.*> - XML формат смотрим
Ожидание:
<req>
<query>Ан</query>
<gender>FEMALE</gender>

Реальность:
<req> <query>Ан</query> <gender>FEMALE</gender></req>

1) Учитывать символы, не соответствующие желаемому образцу
2) Определить квантификатор как нежадный (ленивый, англ. lazy) — большинство реализаций
позволяют это сделать, добавив после него знак вопроса.

Regexp: <[^>]*>

Жадный      Ленивый
   *             *?
   +             +?
  {n,}          {n,}?

<.*?>


  9) Позиция внутри строки
  Если мы хотим найти конкретную фразу, а не слово, то используем следующие спецсимволы:
^ — начало текста (строки)
$ — конец текста (строки)
Regex: ^Я нашел!$
Смотри! Я нашел!
Я нашел! Посмотри!

10) Замена (replace)
RegEx: Ольга
Замена: Макар
Текст был: Привет, Ольга!
Текст стал: Привет, Макар!

Оля + Маша
regexp: (Оля) \+ Маша
-> стало Оля
 */

}
