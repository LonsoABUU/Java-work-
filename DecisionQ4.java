
/**
 * Write a description of class Question7 here.
 *
 * @author (OMAR MIRAJI - BITA/6/22/056/TZ)
 * @version (a version number or a date)
 */
import java.util.*;
public class DecisionQ4
{
    public static void main(String[]args){
        Scanner Scanner=new Scanner(System.in);
        for (int i =1; i<=3; i++){
            System.out.print("Enter runner " + i +"s name: ");
            String name = Scanner.nextLine();
            System.out.println("Enter time taken to finish (in minutes): ");
            double time = Scanner.nextDouble();
            System.out.println("Runner" + i + ":" + name + "-Time:" + time + "minutes: ");
            Scanner.nextLine();
            
        }
    }
}

