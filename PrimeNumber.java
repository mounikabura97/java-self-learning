import java.util.Scanner;
class PrimeNumber 
{
    public static void main( String args[] ) 
    {
        // Write your code here
         Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int count = 0;
        for(int i=1 ;i<= number;i++){
            if(number % i == 0){
                count+=1;
            }
        }
        if(count == 2){
            System.out.println(number + "is a prime number");
        }    
        else {
            System.out.println(number + "is not a prime number");
        }
        scanner.close();
    }
}