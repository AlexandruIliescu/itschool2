package session10_inheritance_and_encapsulation.animal_problem;

public class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("The mammal is eating plants or other animals");
    }
}