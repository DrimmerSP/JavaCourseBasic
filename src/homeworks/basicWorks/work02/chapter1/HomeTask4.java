package homeworks.basicWorks.work02.chapter1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HomeTask4 {
    //Необходимо вывести на экран построчно сколько встретилось различных элементов.
    // Каждая строка должна содержать количество элементов и сам элемент через пробел.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Map<Integer, Integer> result = new HashMap<>();
        for (int j = 0; j < arr.length; j++) {
            if (result.containsKey(arr[j])){
                int temp = result.get(arr[j]);
                result.put(arr[j], temp +1);
            }else {
                result.put(arr[j], 1);
            }
        }
        for (Map.Entry<Integer, Integer> item : result.entrySet()) {
            System.out.println(item.getValue() + " " + item.getKey());
        }

    }
}
