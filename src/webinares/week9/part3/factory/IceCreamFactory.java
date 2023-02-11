package webinares.week9.part3.factory;

public class IceCreamFactory {
    public static IceCream getIceCream(IceCreamType iceCreamType) {
     return switch (iceCreamType) {
         case CHERRY -> new CherryIceCream();
         case CHOCOLATE -> new ChocolateIceCream();
         case VANILLA -> new VanillaIceCream();
     };
    }

    private IceCreamFactory() {};
}
