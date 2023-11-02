package session8_arraylist_linkedlist_wrappers;

public class WrapperClasses {

    public static void main(String[] args) {
        int number = 10;
        Integer number2 = Integer.valueOf(number);
        Integer autoboxedNumber = 10;

        String randomNumber = "12";
        Integer randomNumberAsInteger = Integer.parseInt(randomNumber);

        printRoundedNumber("43.36");
    }

    public static void printRoundedNumber(String number) {
        Double doubleNumber = Double.parseDouble(number);
        long rounderNumber = Math.round(doubleNumber);
        System.out.println(rounderNumber);
    }
}