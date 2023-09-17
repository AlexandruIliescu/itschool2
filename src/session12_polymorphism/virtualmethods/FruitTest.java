package session12_polymorphism.virtualmethods;

public class FruitTest {

    public static void main(String[] args) {
        printFruitDetails(new Apple());
        printFruitDetails(new Orange());
    }

    public static void printFruitDetails(Fruit fruit) {
        System.out.println("Taste: " + fruit.taste());
        System.out.println("Colour: " + fruit.colour());
    }
}