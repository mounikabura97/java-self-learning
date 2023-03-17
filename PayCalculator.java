import java.util.Scanner;

public class PayCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read in the number of hours worked and the hourly rate
        System.out.print("Enter the number of hours worked: ");
        double hoursWorked = input.nextDouble();
        System.out.print("Enter the hourly rate: ");
        double hourlyRate = input.nextDouble();

        // Calculate regular pay and overtime pay
        double regularPay = Math.min(hoursWorked, 40) * hourlyRate;
        double overtimePay = Math.max(0, hoursWorked - 40) * 1.5 * hourlyRate;

        // Calculate total pay
        double totalPay = regularPay + overtimePay;

        // Print the results
        System.out.println("Regular pay: " + regularPay);
        if (overtimePay > 0) {
            System.out.println("Overtime pay: " + overtimePay);
            System.out.println("Total pay: " + totalPay);
        }
        input.close();
    }
}
