
/**
 *
 * @author www.github.com/cruzken
 */
 
 import java.util.Scanner;
 
public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int factorial = Integer.parseInt(reader.nextLine());
        int n = 1;
        int result = n;
         
        while (n <= factorial) {
            result = result * n;
            n++;
        }
        System.out.println("Factorial is " + result);
    }
}
