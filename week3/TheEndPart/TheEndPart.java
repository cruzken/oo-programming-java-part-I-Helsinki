
import java.util.Scanner;
 
public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the word: ");
        String word = reader.nextLine();
        int wordlength = word.length();
        System.out.println("Lengeth of the first part: ");
        int endpart = Integer.parseInt(reader.nextLine());
        System.out.println("Result: " + word.substring((wordlength - endpart)
                            , wordlength));
    }
}