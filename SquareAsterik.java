import java.util.Scanner;
class Test 
{
    public static void main( String args[] ) 
    {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side length of square:");
        int n = scanner.nextInt();
        for(int i=0 ; i < n ; i++) {
            for (int j=0; j < n ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        scanner.close();
    }
}