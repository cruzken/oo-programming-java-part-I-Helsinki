
/**
 *
  * @author www.github.com/cruzken
   */

public class Least {
 
    public static int least(int number1, int number2) {
        // write program code here
        // do not print anything inside the method
        // method needs a return in the end
        if (number1 < number2) {
        int output = number1;
        return output;
        } else {
            int output = number2;
            return output;
        }
         
    }
 
    public static void main(String[] args) {
        int result = least(2, 7);
        System.out.println("Least: " + result);
    }
}
