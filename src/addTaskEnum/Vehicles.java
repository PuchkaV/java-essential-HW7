package addTaskEnum;

public enum Vehicles {

    CAR(50000,"red"), BOAT(100000, "white"), PLANE(2000000, "blue");

    private final int price;
    private final String color;


    Vehicles(int price, String color) {
        this.price = price;
        this.color = color;
    }

     public String getColor() {
        return color;
    }


    @Override
    public String toString() {
        return  name() + ", price=" + price + ", color='" + color;
    }
}
