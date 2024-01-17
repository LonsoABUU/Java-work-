
/**
 * Write a description of class DecisionQ3 here.
 *
 * @author (OMAR MIRAJI - BITA/6/22/056/TZ)
 * @version (a version number or a date)
 */
import java.util.*;
public class DecisionQ3
{


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your ID number:");
        int IDNumber=input.nextInt();
        System.out.println("Enter the hourly pay rate:");
        double PayRate=input.nextDouble();
        System.out.println("Enter the regularHours:");
        int RegularHours=input.nextInt();
        
        double OvertimeHoursPay=((1.5)*RegularHours);
        
    }
}


