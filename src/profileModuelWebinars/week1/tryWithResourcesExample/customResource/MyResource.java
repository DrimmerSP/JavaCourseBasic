package profileModuelWebinars.week1.tryWithResourcesExample.customResource;

public class MyResource implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Close MyResource!");
    }
    public void printHello() {
        System.out.println("Hello!");
    }
}
