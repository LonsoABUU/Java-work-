
/**
 * Write a description of class Question5 here.
 *
 * @author (OMAR MIRAJI - BITA/6/22/056/TZ)
 * @version (a version number or a date)
 */
import java.util.*;
public class DesicionQ1{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        System.out.println("years of citizenship: ");
        int years = input.nextInt();
        boolean eligibilitySenate = age >=30 && years >=9;
        boolean eligibilityHouse = age >=25 && years >=7;
         System.out.println("eligibility Senate: " + (eligibilitySenate ? "YES":"NO"));
         System.out.println("eligibility House: " + (eligibilityHouse ? "YES":"NO"));
        

    }
}