import java.util.Scanner;
class GCDCalculator
{
  public static void main(String[] args) 
  {
    // Write your code here
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter first natural number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second natural number: ");
        int num2 = sc.nextInt();

        int gcd = findGCD(num1, num2);
        System.out.println("The greatest common divisor is: "+ gcd);
        sc.close();
    }

    public static int findGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return findGCD(num2, num1 % num2);
        }
    }

}