import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of terms (maximum 20) for the Fibonacci sequence: ");
        n = myObj.nextInt();
        if (n <= 1 || n > 20) {
            System.out.println("It seems the number of terms for the Fibonacci sequence has an invalid value: ");
        } else {
            int[] fib = new int[n];
            fib[0] = 0;
            fib[1] = 1;

            System.out.println("First n terms of fibonacci sequence are: ");
            int count = 2;

            while (count < n) {
                fib[count] = fib[count - 2] + fib[count - 1]; // adding last two terms
                count++;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(fib[i] + " ");
            }
        }
        System.out.println("\n*** Finish generating Fibonacci Numbers ***");
        myObj.close();
    }
}