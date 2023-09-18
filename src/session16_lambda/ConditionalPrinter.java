package session16_lambda;

@FunctionalInterface
public interface ConditionalPrinter {

    void print(String input, boolean condition);
}