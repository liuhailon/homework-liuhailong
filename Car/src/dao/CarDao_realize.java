package dao;

import entity.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDao_realize implements CarDao {
    public static List<Car> cars=null;
    static {
        cars=new ArrayList<Car>();
        cars.add(new Car(1,"宝骏530","2018/1/09",112000f,"自动档"));
        cars.add(new Car(2,"奥迪A6L","2018/5/11",400000f,"手动档"));
        cars.add(new Car(3,"丰田C-HR","2018/3/31",145800f,"自动档"));
        cars.add(new Car(4,"宝马X5","2018/4/15",798000f,"手动档"));
        cars.add(new Car(5,"凯迪拉克XT6","2018/6/21",399000f,"手动档"));
    }
    @Override
    public List<Car> carList() {
        return cars;
    }

    @Override
    public Car querycarByName(String carName) {
        for (Car car : cars) {
            if(carName.equals(car.getCarName())){
                return car;
            }
        }
        return null;
    }

    @Override
    public List<Car> addCar(Car car) {
        cars.add(car);
        return cars;
    }

    @Override
    public List<Car> deleteCarById(int num) {
        for (Car car : cars) {
            if(num==car.getCarId()){
                cars.remove(car);
                return cars;
            }
        }
        return null;
    }

    @Override
    public List<Car> updateCar(Car car) {
        for (Car ca : cars) {
            if(ca.getCarId()==car.getCarId()){
                ca.setCarId(car.getCarId());
                ca.setCarName(car.getCarName());
                ca.setCarDate(car.getCarDate());
                ca.setCarPrice(car.getCarPrice());
                ca.setCarType(car.getCarType());
                return cars;
            }
        }
        return null;
    }

}
