import java.util.Scanner;
 
public class FirstCharacter {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        char first = firstCharacter(reader.nextLine());
        System.out.println("First character: " + first);
    }
     
    public static char firstCharacter(String text) {
        char output = text.charAt(0);
        return output;
    }
}