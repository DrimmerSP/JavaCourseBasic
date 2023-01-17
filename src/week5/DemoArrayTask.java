package week5;

public class DemoArrayTask {
    public static void main(String[] args) {

        int[] numbers  = new int[4];
        String[] strings = new String[2];

        numbers[0] = 1;
        numbers[1] = 99;
        numbers[2] = 234;
        numbers[3] = 2;

        strings[1] = "QWERTY";

        for (int i = 0; i < 4; i++) {
            System.out.println(numbers[i]);
        }

        int[] numbers2 = new int[] {1, 2, 3, 4, 5};
        int[] numbers3 = {1, 2, 3, 4, 5};

    }

}
