package session11_abstraction.abstractionpractice;

public class FinalKeyword {
}

class Parent {

    final void showMessage() {
        System.out.println("Show some message");
    }
}

class Child extends Parent {

    //we can't override this method due to final keyword
//    void showMessage() {
//
//    }
}