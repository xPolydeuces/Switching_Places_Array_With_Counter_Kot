import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // This app takes array within range (10-1) and then moves it by one index to the left
        int counter = 0;
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Przed: ");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int larger = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = larger;
                    counter++;
                }
                counter++;
            }
            counter++;
        }
        System.out.println("Po: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Number of operations: " + counter);
    }
}