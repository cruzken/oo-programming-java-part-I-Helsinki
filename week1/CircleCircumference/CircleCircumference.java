
/**
 *
 * @author www.github.com/cruzken
 */
  
import java.util.Scanner;
 
public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
 
        // Program your solution here
        System.out.print("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());
         
        System.out.print("");
        System.out.print("Circumference of the circle: " + (2 * Math.PI * radius));
    }
}