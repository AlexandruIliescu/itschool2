package session12_polymorphism.compositionoverinheritance.composition;

public class Car {

    private Engine engine;

    Car(Engine engine) {
        this.engine = engine;
    }

    void start() {
        engine.start();
    }
}