package Week5;
/*
  На вход подается число N - длина массива.
     Затем передается массив строк длины N.
     После этого - число M.

     Сохранить в другом массиве только те элементы, длина строки которых
     не превышает M.

     Входные данные:
     5
     Hello
     good
     to
     see
     you
     4

     Выходные данные:
     good to see you
 */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        String[] arr = new String[n];

        // заполняем массив входными данными
        for (int i = 0; i < n; i++) {
            arr[i] = console.next();
        }

        int m = console.nextInt();

        int k = 0;
        String[] result = new String[n];
        for (String str : arr) {
            if (str.length() <= m){
                result[k++] = str;
            }
            for (int i = 0; i < k; i++) {
                System.out.print(result[i] + " ");
            }
        }

    }
}
