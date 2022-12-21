package HomeWork1;

import java.util.Scanner;
public class Hometask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        double v = 4. / 3 * Math.PI * Math.pow(r, 3);
        System.out.println(v);
    }
}
