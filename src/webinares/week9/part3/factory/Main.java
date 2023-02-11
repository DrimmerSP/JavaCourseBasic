package webinares.week9.part3.factory;

public class Main {
    public static void main(String[] args) {
        //    IceCreamFactory iceCreamFactory = new IceCreamFactory(); //не надо так!

        IceCream cherry = IceCreamFactory.getIceCream(IceCreamType.CHERRY);
        IceCream chocolate = IceCreamFactory.getIceCream(IceCreamType.CHOCOLATE);
        IceCream vanilla = IceCreamFactory.getIceCream(IceCreamType.VANILLA);

        cherry.printIngredients();
        chocolate.printIngredients();
        vanilla.printIngredients();

    }

}
