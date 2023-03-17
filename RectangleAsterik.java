import java.util.Scanner;
class RectangleAsterik 
{
    public static void main(String args[]) 
    {
        // Write your code here
        Scanner myObj = new Scanner(System.in); 
        int h = 0;
        int w = 0;
        System.out.println("Enter the height of rectangle: ");
        h = myObj.nextInt();
        System.out.println("Enter the width of rectangle: ");
        w = myObj.nextInt();
        for (int x = 0 ; x < h; x++)
        {
            for (int y = 0 ; y < w; y++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        myObj.close();
    }
}