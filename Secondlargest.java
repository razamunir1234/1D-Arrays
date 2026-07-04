
import java.util.Arrays;
public class Secondlargest {


    public static int findSecondLargest(int[] array) {
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        return array[array.length - 2];
    }

    public static void main(String[] args) {
        int[] array = {10, 5, 8, 20, 15};

        System.out.println("Second largest element: "
                + findSecondLargest(array));
    }
}

