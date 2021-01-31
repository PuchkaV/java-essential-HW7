package task3StaticClass;

public class Distance {
    private double distance;

    public Distance(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void print(){
        System.out.println("distance " + distance);
    }

    public static class Converter{

        public static double kmToMeter(double value){
            return value * 1000;
        }

        public static double meterToKm(double value){
            return value/1000;
        }

        public static double kmToMile (double value){
            return value / 1.61;
        }
    }
}
