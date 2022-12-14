package Week2;

import java.util.Scanner;

// Дано число n. Нужно проверить четное ли оно.
/*

        Входные данные: 4
        Выходные данные: true или (Число четное)

        Входные данные: 3
        Выходные данные: false или (Число нечетное)
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        String str;
        if (n % 2 == 0){
            str = "Число чётное";
        }else {
            str = "число не чётное";
        }

        String str2 = (n % 2 == 0) ? "Число чётное" : "число не чётное";
        System.out.println(str);
        System.out.println(str2);
    }
}
