package session10.animal_problem;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("The birds is eating seeds and insects");
    }
}