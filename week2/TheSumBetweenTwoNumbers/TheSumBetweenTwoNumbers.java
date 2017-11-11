
/**
 *
 * @author www.github.com/cruzken
 */
 
 import java.util.Scanner;
  
  
 public class TheSumBetweenTwoNumbers {
     public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);
         System.out.println("First: ");
         int lower = Integer.parseInt(reader.nextLine());
         System.out.println("Last: ");
         int upper = Integer.parseInt(reader.nextLine());
          
         int add = lower;
         while (lower < upper) {
             lower++;
             add = add + lower;
         }
         System.out.println("Sum is " + add);
     }
 }
 