import java.util.Scanner;

public class ArrayToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of digits in the array: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the digits of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int decimal = 0;
        for (int i = 0; i < n; i++) {
            decimal = decimal * 10 + arr[i];
        }

        System.out.println("Decimal number: " + decimal);

        input.close();
    }
}
