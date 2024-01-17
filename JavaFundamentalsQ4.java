
/**
 * Write a description of class Question4 here.
 *
 * @author (OMAR MIRAJI - BITA/6/22/056/TZ)
 * @version (a version number or a date)
 */
import java.util.*;
public class JavaFundamentalsQ4
{
        public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your actual value");
        double actualValue = input.nextDouble();
        System.out.println("Enter tax rate");
        double taxRate = input.nextDouble();
        double assesedValue = (0.6 * taxRate);
        double annualPropertyTex = (assesedValue / 100) * taxRate;
        System.out.println("annualProperTax");
        System.out.println("assesedValue");
    }
}

