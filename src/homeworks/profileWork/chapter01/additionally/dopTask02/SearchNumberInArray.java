package homeworks.profileWork.chapter01.additionally.dopTask02;

import java.util.Scanner;

/**
 * 2)
 * паблик класс ПоискЧислаВМассиве(){
 * мэин{
 * 	инт н;
 * 	Cканнер сканнер = нью Сканнер(Систем.ин);
 * 	н = сканнер.некстИнт;
 * 	Интеджер[] аррай = нью Интеджер[н];
 *
 * 	фор(и = 0; и < аррай.ленгхт; и++){
 * 		аррай[и] = сканнер.некст.инт;
 *        }
 * 	инт п= сканнер.некстИнт;
 * 	Систем.аут.принтлн(поискЧисла(аррай, п));
 * }
 *
 * приват статик инт поискЧисла(Интеджер[] аррай, инт п){
 * 	инт лево = 0;
 * 	инт право = аррай.ленгхт - 1;
 * 	вайл(лево <= право){
 * 	   инт центр = (лево+право) / 2;
 * 	   иф(аррай[хцентр] == п){
 * 	     ретурн центр;
 *    }элс иф(аррай[хцентр] < п){
 * 	   лево = центр + 1;
 *    }элс{
 * 	   право = центр - 1;
 *    }
 *      }
 * 	ретурн -1;
 *   }
 * }
 */
public class SearchNumberInArray {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        Integer[] array = new Integer[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int p = scanner.nextInt();

        System.out.println(searchNumber(array, p));
    }

    private static int searchNumber(Integer[] array, int p) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == p) {
                return mid;
            } else if (array[mid] < p) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

