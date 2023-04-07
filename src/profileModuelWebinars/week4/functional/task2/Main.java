package profileModuelWebinars.week4.functional.task2;

/*
С помощью функционального интерфейса выполнить подсчет квадрата числа
 */
public class Main {

    public static void main(String[] args) {
        Square functionalInterface = new Square() {
            @Override
            public int calculateSquare(int x) {
                return x * x;
            }
        };

        int result = functionalInterface.calculateSquare(5);
        System.out.println(result);

        Square functionalInterfaceLamda = (x) -> x * x;
        System.out.println(functionalInterfaceLamda.calculateSquare(3));


    }
}
