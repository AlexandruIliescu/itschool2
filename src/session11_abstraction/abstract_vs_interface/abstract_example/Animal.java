package session11_abstraction.abstract_vs_interface.abstract_example;

public abstract class Animal {

    public void eat() {
        System.out.println("This animal eats food.");
    }

    public abstract void makeSound();
}