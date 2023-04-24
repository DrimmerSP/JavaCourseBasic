package homeworks.basicWorks.work02.chapter2;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class HomeTask7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] name = new String[n];
        String[] petName = new String[n];
        int[][] score = new int[n][3];

        for (int i = 0; i < n; i++) {
            name[i] = scanner.next();
        }
        for (int i = 0; i < n; i++) {
            petName[i] = scanner.next();
        }
        // scanner.nextLine();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                score[i][j] = scanner.nextInt();
            }
        }

        double[] midScore = new double[n];
        for (int i = 0; i < n; i++) {
            midScore[i] = (score[i][0] + score[i][1] + score[i][2]) / 3.0;
        }

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        int index = 0;
        double xedni = midScore[0];
        for (int i = 0; i < n; i++) {
            if (xedni < midScore[i]) {
                xedni = midScore[i];
                index = i;
            }
        }

        System.out.println(String.format("%s: %s, %.1f", name[index], petName[index], midScore[index]));

        midScore[index] = 0;

        index = 0;
        xedni = midScore[0];
        for (int i = 0; i < n; i++) {
            if (xedni < midScore[i]) {
                xedni = midScore[i];
                index = i;
            }
        }

        StringBuilder builder = new StringBuilder(String.format("%s: %s, %s", name[index], petName[index],
                decimalFormat.format(midScore[index])));
        builder.setLength(builder.length() - 1);
        System.out.println(builder);

        midScore[index] = 0;

        index = 0;
        xedni = midScore[0];
        for (int i = 0; i < n; i++) {
            if (xedni < midScore[i]) {
                xedni = midScore[i];
                index = i;
            }
        }

        builder = new StringBuilder(String.format("%s: %s, %s", name[index], petName[index],
                decimalFormat.format(midScore[index])));
        builder.setLength(builder.length() - 1);
        System.out.println(builder);

        midScore[index] = 0;
    }
}
