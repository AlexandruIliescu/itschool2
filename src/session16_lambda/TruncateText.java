package session16_lambda;

@FunctionalInterface
public interface TruncateText {

    String truncate(String input, int maxLength);
}
