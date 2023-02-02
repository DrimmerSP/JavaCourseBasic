package homeworks.work02.chapter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeTask9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<String> list = new ArrayList<>();
        String buff;
        while (scanner.hasNext()){
            buff = scanner.nextLine();
            if (list.contains(buff)){
                System.out.println(buff);
               break;
            }else {
                list.add(buff);
            }
        }
    }
}
