import java.util.Scanner;
 
 
public class LastCharacter {
 
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a name: ");
        char lastchar = lastCharacter(reader.nextLine());
        System.out.println("Last characeter: " + lastchar);
    }
    public static char lastCharacter(String text) {
        int lastPosition = text.length() - 1;
        char output = text.charAt(lastPosition);
        return output;
    }
}