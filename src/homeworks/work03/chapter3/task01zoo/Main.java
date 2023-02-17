package homeworks.work03.chapter3.task01zoo;

public class Main {
   public static void main(String[] args) {
      Dolphin ecco = new Dolphin();
      System.out.println("Дельфин \"Ecco\": ");
      ecco.wayOfBirth();
      ecco.eat();
      ecco.swim();
      ecco.sleep();

      System.out.println("=============================");
      System.out.println();

      GoldFish iris = new GoldFish();
      System.out.println("Золотая рыбка \"Iris\": ");
      iris.wayOfBirth();
      iris.eat();
      iris.swim();
      iris.sleep();

      System.out.println("=============================");
      System.out.println();

      Eagle dios = new Eagle();
      System.out.println("Орёл \"Dios\": ");
      dios.wayOfBirth();
      dios.eat();
      dios.fly();
      dios.sleep();

      System.out.println("=============================");
      System.out.println();

      Bat aizi = new Bat();
      System.out.println("Летучая мышь \"Aizi\": ");
      aizi.wayOfBirth();
      aizi.eat();
      aizi.fly();
      aizi.sleep();
   }

}
