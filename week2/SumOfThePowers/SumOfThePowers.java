
/**
 *
 * @author www.github.com/cruzken
 */
 
 import java.util.Scanner;
 
public class SumOfThePowers {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        Integer power = Integer.parseInt(reader.nextLine());
        Integer n = 0;
        Integer result = (int)Math.pow(2, n);
        while (n < power) {
            n++;
            result += (int)Math.pow(2, n);
        }
        System.out.println("The result is: " + result);
    }
}
