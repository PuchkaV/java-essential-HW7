package task3StaticClass;

public class Main {
    public static void main(String[] args) {
        Distance distance = new Distance(100.0);
        distance.print();
        System.out.println("kmToMeter: " + Distance.Converter.kmToMeter(distance.getDistance()));
        System.out.println("kmToMile: " + Distance.Converter.kmToMile(distance.getDistance()));
        System.out.println("meterToKm: " + Distance.Converter.meterToKm(distance.getDistance()));
    }
}
