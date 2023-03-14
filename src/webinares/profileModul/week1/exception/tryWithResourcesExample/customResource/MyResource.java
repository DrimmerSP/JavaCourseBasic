package week1.exception.tryWithResourcesExample.customResource;

public class MyResource implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Close MyResource!");
    }
    public void printHello() {
        System.out.println("Hello!");
    }
}
