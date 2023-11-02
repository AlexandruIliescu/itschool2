package session3_java_operators;

import java.util.Scanner;

public class ScannerClass {

    //psvm - shortcut
    public static void main(String[] args) {
        //sout - shortcut
        System.out.println();

        String userName = "Maria";
        int userAge = 34;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide some text:");
        String userInput = scanner.nextLine();
        System.out.println("Your input is: " + userInput);

        scanner.close();
    }
}