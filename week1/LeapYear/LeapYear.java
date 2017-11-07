
/**
 *
 * @author www.github.com/cruzken
 */
 
 import java.util.Scanner;
  
 public class LeapYear {
  
     public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);
          
         System.out.println("Type a year: ");
         int year = Integer.parseInt(reader.nextLine());
          
         if (year % 100 < 1) {
             if (year % 400 < 1) {
                 System.out.println("The year is a leap year.");
             } else {
                 System.out.println("The year is not a leap year.");
             }
              
         } else {
             if (year % 4 < 1) {
                 System.out.println("The year is a leap year.");
             } else {
                 System.out.println("The year is not a leap year.");
             }
         }
  
     }
 }