package homeWork4;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTaskDop2 {
        // Код не имеет вложенных циклов
        // Arrays.sort выполняется рекурсивно, судя по реализации сложность должна быть линейной
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int[] a2 = new int[n];
            int temp = 0;
            for (int i = 0; i < arr.length; i++) {
                temp = arr[i] * arr[i];
                a2[i] = temp;
            }
            Arrays.sort(a2);
            for (int i = 0; i < a2.length; i++) {
                System.out.print(a2[i] + " ");
            }
        }
}
