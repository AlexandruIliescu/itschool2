package session11_abstraction.abstract_vs_interface.abstract_example;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}