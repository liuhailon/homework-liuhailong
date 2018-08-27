package dao;

import entity.Car;

import java.util.List;

public interface CarDao {
    public List<Car> carList();
    public Car querycarByName(String carName);
    public List<Car> addCar(Car car);
    public List<Car> deleteCarById(int carId);
    public List<Car> updateCar(Car car);
}
