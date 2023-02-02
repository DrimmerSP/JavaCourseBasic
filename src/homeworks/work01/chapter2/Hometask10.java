package homeworks.work01.chapter2;

import java.util.Scanner;

public class Hometask10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        if (Math.log(Math.exp(x))  == x){
            System.out.println(true);
        }else
            System.out.println(false);
    }
}
