package entity;

import dao.CarDao_realize;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Car> cars = new CarDao_realize().carList();
        System.out.println(cars);
    }
}
