package session12.virtualmethods;

public class Apple extends Fruit {

    @Override
    public String taste() {
        return "apple is sweet";
    }

    @Override
    public String colour() {
        return "apple is red";
    }
}