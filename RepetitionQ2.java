
/**
 * Write a description of class Question10 here.
 *
 * @author (OMAR MIRAJI - BITA/6/22/056/TZ)
 * @version (a version number or a date)
 */
import java.util.*;
public class RepetitionQ2
{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the speed of the vehicle in mph: ");
        int speed = input.nextInt();
        System.out.println("Enter  the number of hours of hours traveled: ");
        int hours = input.nextInt();
        System.out.println("Hour\tDistance Traveled");
        for(int hour = 1; hour <= hours; hour++){
            int distance = speed * hour;
            System.out.println(hour + "\t" + distance);
        }
    }
}   

