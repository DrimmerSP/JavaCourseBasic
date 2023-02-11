package webinares.week9.part1.arraylistexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortOperation {
    public static void main(String[] args) {
        ArrayList<Car> carsWithYear = new ArrayList<>();
        carsWithYear.add(new Car("TOYOTA", 2023));
        carsWithYear.add(new Car("BMW", 2010));
        carsWithYear.add(new Car("VOLVO", 2020));

        System.out.println(carsWithYear);

//        Collections.sort(carsWithYear); - не работает!

        //Сравнение по модели
        carsWithYear.sort(new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getCarBrand().compareTo(car2.getCarBrand());
            }
        });
        System.out.println(carsWithYear);

//        //Сравнение по году
        Collections.sort(carsWithYear, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return Integer.compare(car1.getYearOfManufacture(), car2.getYearOfManufacture());
            }
        });
        System.out.println(carsWithYear);

//        carsWithYear.sort((car1, car2) -> car1.getCarBrand().compareTo(car2.getCarBrand()));
//        carsWithYear.sort(Comparator.comparing(Car::getCarBrand));
    }
}
