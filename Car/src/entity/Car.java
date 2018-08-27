package entity;
public class Car{
    private int carId;          //汽车编号
    private String carName;     //汽车名称
    private String carDate;     //出厂日期
    private double carPrice;   //汽车报价
    private String carType;     //汽车类型
    public Car(){

    }
    public Car(int carId, String carName, String carDate, double carPrice, String carType) {
        this.carId = carId;
        this.carName = carName;
        this.carDate = carDate;
        this.carPrice = carPrice;
        this.carType = carType;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }


    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarDate() {
        return carDate;
    }

    public void setCarDate(String carDate) {
        this.carDate = carDate;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return carId+","+carName+"," +  carDate+"," +  carPrice+"," + carType+"," ;
    }
}
