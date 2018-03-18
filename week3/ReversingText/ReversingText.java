
import java.util.Scanner;
 
public class ReversingText {
 
    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        int textlength = text.length() - 1;
        String reversetext = "";
        while (textlength >= 0) {
            reversetext = reversetext.concat(text.substring(textlength, (textlength + 1)));
            textlength--;
        }
        return reversetext;
    }
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}