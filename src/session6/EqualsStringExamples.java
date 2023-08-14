package session6;

public class EqualsStringExamples {

    public static void main(String[] args) {
        String colour1 = "Blue";
        String colour2 = "blUE";

        System.out.println(colour1.equals(colour2));
        System.out.println(colour1.equalsIgnoreCase(colour2));
        System.out.println(colour1.toLowerCase().equals(colour2.toLowerCase()));
    }
}