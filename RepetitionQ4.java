
/**
 * Write a description of class Question12 here.
 *
 * @author (OMAR MIRAJI - BITA/6/22/056/TZ)
 * @version (a version number or a date)
 */
import java.util.*;
public class RepetitionQ4
{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter positive numbers (Enter a negative number  to end): ");
        int number;
        while ((number = input.nextInt()) >= 0){
            sum += number;
        }
        System.out.println("Sum of positive numbers: " + sum);
    }
}

