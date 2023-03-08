package homeworks.profileWork.chapter01.additionally.dopTask01;

import java.util.Arrays;
import java.util.Scanner;

/**
 *1)
 * паблик класс ДваМаксимальных(){
 * мэин{
 * 	инт н;
 * 	Cканнер сканнер = нью Сканнер(Систем.ин);
 * 	н = сканнер.некстИнт;
 * 	Интеджер[] аррай = нью Интеджер[н];
 *
 * 	фор(и = 0; и < аррай.ленгхт; и++){
 * 		аррай[и] = сканнер.некст.инт;
 *        }
 * 	Аррайс.сорт(аррай);
 * 	Систем.аут.принтлн(аррай[н - 1] + " " + аррай[н - 2]);
 *     }
 * }
 */
public class TwoMaxNumber {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        Integer[] array = new Integer[n];

        for (int i = 0; i < array.length; i++) {
           array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.println(array[n - 1] + " " + array[n - 2]);
    }
}
