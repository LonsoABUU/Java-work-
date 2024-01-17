
/**
 * Write a description of class Question1 here.
 *
 * @author (OMAR MIRAJI - BITA/6/22/056/TZ)
 * @version (a version number or a date)
 */
import java.util.*;
public class JavaFundamentalsQ1
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 2-digit integer(non-zero rightmost digit non-zero):");
        int x = input.nextInt();
        if (x > 10 || x > 99 || x % 10 == 0){
             System.out.print("Invalid input.please enter q2-digit integer with a non-zero rightmost digit.");
             int y = (x % 10) * 10 +(x/10);
             System.out.println("x: " + x);
             System.out.println("y: " + y);
             System.out.println("x + y:" + (x + y));
       
        }
        
    }
}
