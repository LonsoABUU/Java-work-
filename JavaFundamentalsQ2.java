
/**
 * Write a description of class Question2 here.
 *
 * @author (OMAR MIRAJI - BITA/6/22/056/TZ)
 * @version (a version number or a date)
 */
import java.util.*;
public class JavaFundamentalsQ2
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you name: ");
        String name = new String();
       name = input.nextLine();
        

        System.out.println("Enter your age: ");
        int age = input.nextInt();

         System.out.println("Enter your city: ");
         String city = new String();
         city = input.nextLine(); 

          System.out.print("Enter your Profession: ");
           String Profession = new String();
         Profession = input.nextLine();

         System.out.println("Enter your animal: ");
          String animal = new String();
         animal = input.nextLine();

          System.out.print("Enter your college : ");
           String college = new String();
         college = input.nextLine();

         System.out.println("Enter your pets: ");
          String pets = new String();
         pets = input.nextLine();

         System.out.println("There once was a person named"+name+"who lived in"+city+".");
         System.out.println("At the age of"+age+","+name+"went to college at" +college+".");
         System.out.println(name+"graduted and went to work as a" +Profession+".");
         System.out.println("Then,"+name+"adopted a(n)"+pets+"named"+pets+".");
         System.out.println("They both lived happily ever after!");   
        
    }
}

