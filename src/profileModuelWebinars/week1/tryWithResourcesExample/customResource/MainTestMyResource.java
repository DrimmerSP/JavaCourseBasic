package profileModuelWebinars.week1.tryWithResourcesExample.customResource;

public class MainTestMyResource {
    public static void main(String[] args) {
        try (MyResource myResource = new MyResource()) {
            myResource.printHello();
        } catch (Exception e) {
            System.err.println("Exception!");
        }
    }
}
