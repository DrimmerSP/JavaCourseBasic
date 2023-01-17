package week2;

import java.util.Scanner;

/*      Даны два числа a и b. Проверить утверждение, что только одно из них нечетное.
        10 10 false
        11 10 true
        10 11 true
        11 11 false

        XOR - исключающее ИЛИ
        A B RES
        0 0 0
        0 1 1
        1 0 1
        1 1 0
*/
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

//        //что одно нечётное
//        if (a % 2 != 0 || b % 2 != 0){
//            System.out.println(true);
//        }else {
//            System.out.println(false);
//        }

        boolean aIsOdd = a % 2 != 0;
        boolean bIsOdd = b % 2 != 0;

//        if ((aIsOdd &&  !bIsOdd) || (!aIsOdd && bIsOdd)){
//            System.out.println(true);
//        }else {
//            System.out.println(false);
//        }

        if (aIsOdd ^ bIsOdd){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
