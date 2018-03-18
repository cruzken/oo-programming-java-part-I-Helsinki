
import java.util.Scanner;
 
public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
         
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int namelength = name.length();
        if (namelength >= 3) {
            System.out.println("1. character: " + name.charAt(0));
            System.out.println("2. character: " + name.charAt(1));
            System.out.println("3. character: " + name.charAt(2));
        }
    }
}
