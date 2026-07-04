public class RotateArray {

    // Value-returning method
    public static int[] rotateArray(int[] array) {
        int[] result = new int[array.length];

        // Move last element to first position
        result[0] = array[array.length - 1];

        // Shift remaining elements to the right
        for (int i = 0; i < array.length - 1; i++) {
            result[i + 1] = array[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        int[] rotatedArray = rotateArray(array);

        System.out.print("Rotated array: ");
        for (int i = 0; i < rotatedArray.length; i++) {
            System.out.print(rotatedArray[i] + " ");
        }
    }
}