package session4_javaOperatorsAndLoops;

public class TernaryOperator {

    public static void main(String[] args) {
        int firstScore = 200;
        int secondScore = 100;

        String result = firstScore > secondScore ? "First player won." : "Second player won.";
        System.out.println(result);
    }
}