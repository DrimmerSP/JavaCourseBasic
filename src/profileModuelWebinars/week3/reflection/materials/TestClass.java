package profileModuelWebinars.week3.reflection.materials;

public class TestClass {
    public static int count = 0;
    public boolean state;
    private int number = 0;
    private String name = "empty name";

//    public TestClass(int number, String name) {
//        this.number = number;
//        this.name = name;
//    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void printHello(String name) {
        System.out.println(name + ", Hello!");
    }
    private void printInfo() {
        System.out.println("number: " + number + " name: " + name);
    }
}
