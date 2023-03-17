import java.util.Scanner;
class RightTriangle 
{
    public static void main(String args[]) 
    {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side length of right angled triangle:");
        int side = scanner.nextInt();
        for ( int i = 0 ; i < side ; i++) {
            for ( int j=0; j<= i ; j++){
                System.out.print("*");
            }
        }
        System.out.println(" ");
        scanner.close();
    }
}