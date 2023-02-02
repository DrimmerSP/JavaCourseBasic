package homeworks.work01.chapter1;

public class PostfixAndPrefix {
    public static void main(String[] args) {
        int x =2, y =4, z = 1;

        System.out.println(++x - y++ + ++z);
        System.out.println();

        int a = 5, b = 7;
        System.out.println("a++ :" + a++);
        System.out.println("a: " + a);
        System.out.println();
        System.out.println("++b : " + ++b);
        System.out.println("b: " + b);

    }
}
