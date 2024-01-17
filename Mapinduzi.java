
/**
 * Write a description of class Mapinduzi here.
 *
 * @author (OMAR MIRAJI - BITA/6/22/056/TZ)
 * @version (a version number or a date)
 */
public class Mapinduzi
{
   private String name;
   private int day;
   private String mounth;
   
   public Mapinduzi(String name, int day, String mounth){
    this.name=name;
    this.day=day;
    this.mounth=mounth;
    }
    public void setName(String name){
    this.name=name;
    }
    public String getName(){
    return name;
    }
    public void setName(int day){
        this.day=day;
    }
    public int getDay(){
    return day;
    }
    public void setMounth(String mounth){
    this.mounth=mounth;
    }
    public String getMounth(){
    return mounth;
    }
    public String toString(){
    return name+day+mounth;
    }
   
}
