import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeriesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        boolean isFibonacciArray = true;
        int prev = 0, curr = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] != prev && arr[i] != curr) {
                isFibonacciArray = false;
                break;
            }
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }

        if (isFibonacciArray) {
            System.out.println(Arrays.toString(arr) + " contains the terms of the Fibonacci sequence.");
        } else {
            System.out.println(Arrays.toString(arr) + " does not contain the terms of the Fibonacci sequence.");
        }

        input.close();
    }
}
