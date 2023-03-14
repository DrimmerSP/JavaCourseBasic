package webinares.profileModul.week3.reflection.materials;

public class InterfaceExample {

    interface A {
    }

    interface B {
    }

    interface Z {}

    static class C implements A {
    }

    static class D extends C implements B, Z {
    }

    public static void main(String[] args) {
        for (Class<?> clazz : D.class.getInterfaces()) {
            System.out.println(clazz.getName());
        }

        System.out.println(D.class.getSuperclass());
    }


}
