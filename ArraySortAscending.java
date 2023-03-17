import java.util.Arrays;
import java.util.Scanner;

public class ArraySortAscending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("Sorted array in ascending order: " + Arrays.toString(arr));

        input.close();
    }
}
