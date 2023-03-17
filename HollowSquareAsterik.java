import java.util.Scanner;
class HollowSquareAsterik 
{
    public static void main( String args[]) 
    {
        // Write your code here
        Scanner sc = new Scanner(System.in); 
        int n = 0;
        System.out.println("Enter the length of the side of the square: ");
        n = sc.nextInt();
        for (int x = 0; x < n; x++)
        {
            for (int y = 0; y < n; y++)
            {
                if (x == 0 || x == n - 1 || y == 0 || y == n - 1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        sc.close();
    }
}