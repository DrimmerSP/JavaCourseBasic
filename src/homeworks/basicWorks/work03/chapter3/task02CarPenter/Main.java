package homeworks.basicWorks.work03.chapter3.task02CarPenter;

/**
 * Цех по ремонту BestCarpenterEver умеет чинить некоторую Мебель.
 * К сожалению, из Мебели он умеет чинить только Табуретки, а Столы, например, нет.
 * Реализовать метод в цеху, позволяющий по переданной мебели определять, сможет ли ей починить или нет.
 * Возвращать результат типа boolean. Протестировать метод.
 */
public class Main {
    public static void main(String[] args) {
        Stools taburetka = new Stools();
        Tables stol = new Tables();
        BestCarpenterEver bestCarpenterEver = new BestCarpenterEver();

        System.out.println("Возможность ремонта табуретки: " + bestCarpenterEver.repair(taburetka));
        System.out.println("=-=-=-=-=-=");
        System.out.println("Возможность ремонта стола: " + bestCarpenterEver.repair(stol));

        System.out.println();
        System.out.println("=-=-=-=-=-=");
        System.out.println("=-=-=-=-=-=");
        Furniture furniture = new Stools();
        System.out.println(bestCarpenterEver.repair(furniture));
        furniture = new Tables();
        System.out.println(bestCarpenterEver.repair(furniture));
    }
}
