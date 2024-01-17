
/**
 * Write a description of class Question13 here.
 *
 * @author (OMAR MIRAJI - BITA/6/22/056/TZ)
 * @version (a version number or a date)
 */
import java.util.*;
public class RepetitionQ5
{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("input the number:");
       int number = input.nextInt();
       for(number=1;number<=7;number++){
           System.out.println(number+"\t"+(number*2)+"\t"+(number*3)+"\t"+(number*4)+"\t"+(number*4)+"\t"+(number*5)+"\t"+(number*6)+"\t"+
       (number*7));
    }
    }
}

