package homeworks.basicWorks.work01.chapter2;

import java.util.Scanner;

public class Hometask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b && b > c){
            System.out.println("Петя, пора трудиться");
        }else{
            System.out.println("Петя молодец!");
        }
    }
}
