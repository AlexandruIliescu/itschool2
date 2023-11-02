package session10_inheritance_and_encapsulation.animal_problem;

public class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("The fish is eating plankton");
    }
}