package session16_lambda;

public class TestTruncateText {

    public static void main(String[] args) {
        TruncateText truncateText = (input, maxLength) -> input.length() > maxLength ? input.substring(0, maxLength) : input;
        System.out.println(truncateText.truncate("Hello", 5));
    }
}