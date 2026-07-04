import java.util.Arrays;

public class SortEvenOdd {

    public static int[] sortEvenOdd(int[] array) {
        int[] result = new int[array.length];
        int index = 0;

        Arrays.sort(array);

        // even numbers first
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result[index] = array[i];
                index++;
            }
        }

        // then odd numbers
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                result[index] = array[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 3};

        int[] result = sortEvenOdd(array);

        System.out.print("Sorted array: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}