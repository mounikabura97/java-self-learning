import java.util.*;
class EuclideanDistance
{
    public static void main(String[] args)
    {
      // You must calculate the Euclidean distance between two points using four variables. 
    // Please note that the variables xp, yp, xq, yq, and dist already exist.
    // The xp and yp represent the first point; xq and yq represent the second point. 
    // The variable dist is used to store the calculated value of distance.
    
    // Write your code here 
    // double dist = ?
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the x-coordinate of the first point: ");
    int xp = input.nextInt();
    System.out.print("Enter the y-coordinate of the first point: ");
    int yp = input.nextInt();
    System.out.print("Enter the x-coordinate of the second point: ");
    int xq = input.nextInt();
    System.out.print("Enter the y-coordinate of the second point: ");
    int yq = input.nextInt();

    // Calculate the distance between the two points using the Euclidean distance
    // formula
    double distance = Math.sqrt(Math.pow(xq - xp, 2) + Math.pow(yq - yp, 2));

    // Print out the result
    System.out.printf("The Euclidean distance between (%d, %d) and (%d, %d) is %.1f", xp, yp, xq, yq, distance);

    input.close();
    }
}