package session4_java_operators_and_loops;

import session6_java_core_apis.PracticeUser;

public class MemoryReference {

    public static void main(String[] args) {
        String greetingOne = "Hello";
        String greetingTwo = "Hello";
//        System.out.println(greetingOne == greetingTwo);
//        System.out.println(greetingOne.equals(greetingTwo));

        PracticeUser user1 = new PracticeUser();
        PracticeUser user2 = new PracticeUser();
//        user2 = null;
        user2 = user1;
//        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));

        int number1 = 5;
        double number2 = 5.00;
        System.out.println(number1 == number2);
    }
}