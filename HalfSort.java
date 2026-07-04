public class HalfSort {

    public static int[] sortFirstHalfSecondHalf(int[] array) {

        int n = array.length;
        int mid = n / 2;

        // First half ascending
        for (int i = 0; i < mid; i++) {
            for (int j = i + 1; j < mid; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        // Second half descending
        for (int i = mid; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = {8, 3, 7, 2, 6, 1};

        int[] result = sortFirstHalfSecondHalf(array);

        System.out.print("Sorted array: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
