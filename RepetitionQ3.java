
/**
 * Write a description of class Question11 here.
 *
 * @author (OMAR MIRAJI - BITA/6/22/056/TZ)
 * @version (a version number or a date)
 */
  import java.util.*;
public class RepetitionQ3
{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int numberofyears = input.nextInt();
        int totalmonths = numberofyears * 12;
        int totalRainfall = 0;
        for (int year = 1; year <= numberofyears; year++){
            for (int month = 1; month <= 12; month++){
                System.out.print("Enter inches of Rainfall for year " +year+",month" +month+ ":");
                totalRainfall += input.nextInt();
            }
        }
        double averageRainfall = totalRainfall / totalmonths;
        System.out.println("Total months: " +totalmonths);
        System.out.println("Total Inches of Rainfall: " + totalRainfall);
        System.out.println("Average Rainfall per month: " +  averageRainfall);
    }
}

