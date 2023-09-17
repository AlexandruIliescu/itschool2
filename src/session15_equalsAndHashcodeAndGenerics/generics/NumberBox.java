package session15_equalsAndHashcodeAndGenerics.generics;

public class NumberBox<T extends Number> {

    private T number;

    public void set(T number) {
        this.number = number;
    }

    public double doubleNumber() {
        return number.doubleValue();
    }

    public static void main(String[] args) {
        NumberBox<Integer> intBox = new NumberBox<>();
        intBox.set(2);
        System.out.println(intBox.doubleNumber());
    }
}