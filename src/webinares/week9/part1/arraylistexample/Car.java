package webinares.week9.part1.arraylistexample;

import java.util.Objects;

public class Car {
    private String carBrand;
    private int yearOfManufacture;

    public Car(String carBrand) {
        this.carBrand = carBrand;
    }

    public Car(String carBrand, int yearOfManufacture) {
        this.carBrand = carBrand;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfManufacture == car.yearOfManufacture && Objects.equals(carBrand, car.carBrand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carBrand, yearOfManufacture);
    }

    @Override
    public String toString() {
        return "carBrand: " + carBrand +
                " yearOfManufacture: " + yearOfManufacture + '\n';
    }
}
