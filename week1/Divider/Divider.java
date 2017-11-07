
/**
 *
 * @author www.github.com/cruzken
 */

import java.util.Scanner;
 
public class Divider {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
 
        // Implement your program here. Remember to ask the input from user.
        System.out.print("Type a number: ");
        int number1 = Integer.parseInt(reader.nextLine());
         
        System.out.print("Type another number: ");
        int number2 = Integer.parseInt(reader.nextLine());
         
        double result = ((number1 * 1.0) / number2);
                 
        System.out.print("");
        System.out.print("Division: " + number1 + " / " + number2 + " = " + result);
    }
}