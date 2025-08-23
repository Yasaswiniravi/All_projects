package assignment7;
class Car {
    String model;
    Car(String model) {
        this.model = model;
    }
}
public class referencedemo {
    public static void assignNewObject(Car car) {
        car = new Car("Tesla");  
        System.out.println("Inside method: car.model = " + car.model);
    }
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        System.out.println("Before method call: myCar.model = " + myCar.model);
        assignNewObject(myCar);
        System.out.println("After method call: myCar.model = " + myCar.model);
    }
}
