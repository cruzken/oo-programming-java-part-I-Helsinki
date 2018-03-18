
import java.util.Scanner;
 
public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // call your method from here
        System.out.println("Type your name: ");
        int namecount = calculateCharacters(reader.nextLine());
        System.out.println("Number of characters: " + namecount);
         
    }
     
    // do here the method
    public static int calculateCharacters(String text) {
        int output = text.length();
        return output;
    }
     
}
