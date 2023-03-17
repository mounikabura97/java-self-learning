import java.util.Scanner;

public class ArraySumAdjacent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();
        
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        
        int[] sumArr = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            sumArr[i] = arr[i] + arr[i+1];
        }
        
        System.out.print("Sum of adjacent values in the array: ");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(sumArr[i] + " ");
        }
        System.out.println();
        
        input.close();
    }
}
