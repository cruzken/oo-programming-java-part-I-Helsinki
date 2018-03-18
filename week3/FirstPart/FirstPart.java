

import java.util.Scanner;
 
public class FirstPart {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the word: ");
        String word = reader.nextLine();
        System.out.println("Lengeth of the first part: ");
        int firstpart = Integer.parseInt(reader.nextLine());
        System.out.println("Result: " + word.substring(0, firstpart));
    }
}