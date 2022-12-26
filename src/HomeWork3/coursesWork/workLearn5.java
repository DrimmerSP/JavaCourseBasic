package HomeWork3.coursesWork;
/*
    Вспомним программу AdditionQuiz, которая предлагала пользователю ввести ответ на вопрос о сложении двух однозначных
    цифр. Теперь с помощью цикла while с общим условием эту программу можно переписать таким образом, чтобы она позволяла
    пользователю повторно вводить новый ответ до тех пор, пока он не станет правильным,
    как показано в программе RepeatAdditionQuiz.
 */
import java.util.Scanner;

public class workLearn5 {
    public static void main(String[] args) {
        int number1, number2, answer;

        Scanner input = new Scanner(System.in);

        // Сгенерировать два случайных целых числа number1 и number2
        number1 = (int)(Math.random() * 10);
        number2 = (int)(Math.random() * 10);

        // Получить ответ на вопрос "Сколько будет number1 + number2?"
        System.out.print(
                "Сколько будет " + number1 + " + " + number2 + "? ");
        answer = input.nextInt();

        // До тех пор, пока ответ неправильный, запрашивать новый ответ
        while (number1 + number2 != answer) {
            System.out.println("Неправильный ответ. Попробуйте еще раз. ");
            System.out.print("Сколько будет " + number1 + " + " + number2 + "? ");
            answer = input.nextInt();
        }
        System.out.println("Вы угадали!");
    }
}
