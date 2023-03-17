import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();
        
        // Concatenate the two strings using the concat() method
        String str3 = str1.concat(str2);
        
        System.out.println("Concatenated string: " + str3);
        
        input.close();
    }
}
