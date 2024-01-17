
/**
 * Write a description of class Question6 here.
 *
 * @author (OMAR MIRAJI - BITA/6/22/056/TZ)
 * @version (a version number or a date)
 */
import java.util.*;
public class DecisionQ2
{
    public static void main(String[]args){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Please enter 5-digit integer");
        int number =Scanner.nextInt();
        int orginalNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
            }
        boolean isPalindrom = orginalNumber == reversedNumber;
            System.out.println("Is a palindrome!: "+isPalindrom);
}
}

