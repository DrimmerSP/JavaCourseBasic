package homeworks.work03.chapter1.task06;

/**
 * Необходимо реализовать класс AmazingString, который хранит внутри себя строку как массив char и предоставляет
 * следующий функционал:
 * <p>
 * Конструкторы:
 * Создание AmazingString, принимая на вход массив char
 * Создание AmazingString, принимая на вход String
 * Публичные методы (названия методов, входные и выходные параметры продумать самостоятельно).
 * Все методы ниже нужно реализовать “руками”, т.е. не прибегая к переводу массива char в String и без использования
 * стандартных методов класса String.
 * <p>
 * Вернуть i-ый символ строки
 * Вернуть длину строки
 * Вывести строку на экран
 * Проверить, есть ли переданная подстрока в AmazingString (на вход подается массив char).
 * Вернуть true, если найдена и false иначе
 * <p>
 * Проверить, есть ли переданная подстрока в AmazingString (на вход подается String).
 * Вернуть true, если найдена и false иначе
 * <p>
 * Удалить из строки AmazingString ведущие пробельные символы, если они есть
 * Развернуть строку (первый символ должен стать последним, а последний первым и т.д.)
 */

public class AmazingString {
    private char[] amazingChars;

    public AmazingString(char[] amazingChars) {
        this.amazingChars = amazingChars;
    }

    public AmazingString(String str) {
        this.amazingChars = str.toCharArray();
    }

    public char getChar(int i) {
        return amazingChars[i];
    }

    public int getLenght() {
        return amazingChars.length;
    }

    public void print() {
        for (int i = 0; i < amazingChars.length; i++) {
            System.out.print(amazingChars[i]);
        }
        System.out.println();
    }

//     Проверить, есть ли переданная подстрока в AmazingString (на вход подается массив char).
//     Вернуть true, если найдена и false иначе


//    Проверить, есть ли переданная подстрока в AmazingString (на вход подается String).
//    Вернуть true, если найдена и false иначе


//    Удалить из строки AmazingString ведущие пробельные символы, если они есть


//    Развернуть строку (первый символ должен стать последним, а последний первым и т.д.)


}
