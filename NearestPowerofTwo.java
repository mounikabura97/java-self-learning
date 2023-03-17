import java.util.Scanner;

public class NearestPowerofTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read in the input number from the user
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Find the nearest power of 2 using a loop
        int power = 1;
        while (power * 2 < num) {
            power *= 2;
        }

        // Determine which of the two powers of 2 that are closest to num
        int lowerPower = power;
        int upperPower = power * 2;
        if (num - lowerPower < upperPower - num) {
            power = lowerPower;
        } else {
            power = upperPower;
        }

        // Print out the result
        System.out.printf("The nearest power of 2 to %d is %d", num, power);
        input.close();
    }
}
