package session8;

public class BinarySearchExample {

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 13, 17, 20};
        int target = 5;

        int result = binarySearch(array, target);
        if (result != -1) {
            System.out.println("Result:" + result);
        } else {
            System.out.println("Result not found");
        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (array[middle] == target) {
                return middle;
            } else if (array[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
