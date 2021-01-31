package task2StaticClass;

public class Vehicle {

    public void print(){
        System.out.println("vehicle print");
    }

    public static class Wheel {

        public void print() {
            System.out.println("vehicle wheel print");
        }
    }

    public static class Door{

        public void print() {
            System.out.println("vehicle door print");
        }

    }

}
