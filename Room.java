
/**
 * Write a description of class Room here.
 *
 * @author (OMAR MIRAJI - BITA/6/22/056/TZ)
 * @version (a version number or a date)
 */
public class Room
{
    private double width;
    private double length;
    private int floor;
    
    
    public Room(double width,double length,int floor){
    this.width=width;
    this.length=length;
    this.floor=floor;
    }
    public void setWidth(double width){
    if(width>0){
    this.width=width;
    }
    else{
    System.out.println("variable should not be 0 or negative");
    }
}
    public double getLeght(){
    return length;
    }
    public void setFloor(){
    this.floor=floor;
    }
    public int getFloor(){
    return floor;
    }
    public String toString(){
    return length + "x" + width + " , on floor" + floor;
    }
    }
    

