
/**
 *
 * @author www.github.com/cruzken
 */
 
 import java.util.Scanner;
  
 public class TheSumOfSetOfNumbers {
  
     public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);
          
         System.out.println("Until what? ");
         int n = Integer.parseInt(reader.nextLine());
         int sum = 1;
         int add = 1;
          
         while (sum < n) {
             sum++;
             add = add + (1 * sum);         
         }
         System.out.println("Sum is " + add);
          
  
     }
 }
 