package task2StaticClass;

public class Main {

    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.print();
        Vehicle.Door door = new Vehicle.Door();
        door.print();
        Vehicle.Wheel wheel = new Vehicle.Wheel();
        wheel.print();
    }

}
