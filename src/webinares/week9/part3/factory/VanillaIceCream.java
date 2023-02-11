package webinares.week9.part3.factory;

public class VanillaIceCream implements IceCream {
    @Override
    public void printIngredients() {
        System.out.println("Vanilla, Cream, Ice");
    }
}
