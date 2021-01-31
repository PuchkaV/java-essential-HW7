package task2Enum;

public enum Animals {
    LION(3), BEAR(5), RABBIT(2), EAGLE(1);

    private int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name() + " age= " + age;
    }
}
