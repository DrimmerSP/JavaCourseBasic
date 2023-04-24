package homeworks.basicWorks.work03.chapter3.task03columns;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * На вход передается N — количество столбцов в двумерном массиве и M —
 * количество строк. Необходимо вывести матрицу на экран, каждый элемент
 * которого состоит из суммы индекса столбца и строки этого же элемента. Решить необходимо используя ArrayList.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < m; i++) {
            list.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                list.get(i).add(i + j);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
