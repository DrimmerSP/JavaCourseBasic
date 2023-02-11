package webinares.week9.part1.arraylistexample;

import java.util.ArrayList;

public class BaseOperation {
    public static void main(String[] args) {
        //Создание и заполнение ArrayList
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW"));
        cars.add(new Car("VOLVO"));
        cars.add(new Car("TOYOTA"));

        //Итерирование (перебор нашего ArrayList)
        System.out.println("Машины в нашем списке:");
        for (Car car : cars) {
            System.out.println(car.getCarBrand());
        }
        System.out.println();

        //Итерирование с помощью лямба выражения
        System.out.println("Машины в нашем списке (лямбда выражение):");
        cars.forEach(car -> {
            System.out.println(car.getCarBrand());
            //Какие то еще действия
        });
        System.out.println();

        //Удаление элемента из ArrayList
        cars.remove(cars.size() - 1);
        System.out.println("Машины в нашем списке (лямбда выражение):");
        cars.forEach(car -> System.out.println(car.getCarBrand()));

        //ArrayList.contains()
        System.out.println(cars.contains("BMW"));
        System.out.println(cars.contains(new Car("BMW")));

        Car bmw = cars.get(0);
        System.out.println(cars.contains(bmw));

        Car audi = new Car("Audi");
        cars.add(audi);

    }
}
