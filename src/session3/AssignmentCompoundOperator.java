package session3;

public class AssignmentCompoundOperator {

    /*
     *
     */
    public static void main(String[] args) {
        int number = 15;
        number += 5;
        System.out.println("After adding 5: " + number);

        number *= 2;
        System.out.println("After multiply by 2: " + 2);


        byte byteValue = 5;

        /*
         * Below example would lead to a compile error because
         * Java automatically upgrades the result of an integer addition to an int.
         */
        //byteValue = byteValue + byteValue;

        /*
         * On the other hand, the example from below would implicitly cast the result back
         * to the type of byteValue
         */
        byteValue += byteValue; //this is valid

        /*
         * Main advantage of compound assignment:
         * - readability and conciseness: it makes coding a bit easier and more fluid
         */
    }
}