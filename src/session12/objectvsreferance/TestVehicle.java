package session12.objectvsreferance;

public class TestVehicle {

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle truck = new Truck();

        System.out.println(car.fuelType());
        System.out.println(truck.fuelType());

        //explicit casting
        Car anotherCar = (Car) car;
    }
}