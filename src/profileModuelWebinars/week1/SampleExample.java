package profileModuelWebinars.week1;

import java.io.IOException;

public class SampleExample {
    public static void main(String[] args) {
        try {
            int result = devision(55,0);
            System.out.println(result);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
//            System.err.println(ex.getMessage());
        }
    }

    public static int devision(int a, int b) throws IOException {
        if (b == 0) {
         throw new IOException("The divisor cannot be null!");
        }
        return a / b;
    }
}
