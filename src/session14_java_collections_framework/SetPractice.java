package session14_java_collections_framework;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {

    public static void main(String[] args) {
        Set<String> products1 = initializedSet();
//        displayProducts(products1);

        Set<String> products2 = initializedSet();
        products2.add("P103");
        products2.add("P104");

        displayProducts(mergeProducts(products1, products2));
    }

    private static Set<String> initializedSet() {
        Set<String> products = new HashSet<>();
        products.add("P100"); //Product 100
        products.add("P101");
        products.add("P102");

        return products;
    }

    private static void displayProducts(Set<String> products) {
        for (String product : products) {
            System.out.println(product);
        }
    }

    private static Set<String> mergeProducts(Set<String> firstSet, Set<String> secondSet) {
        Set<String> result = new HashSet<>(firstSet);
        result.addAll(secondSet);
        return result;
    }
}