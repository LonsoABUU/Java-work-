
/**
 * Write a description of class textStockItem here.
 *
 * @author (OMAR MIRAJI - BITA/6/22/056/TZ)
 * @version (a version number or a date)
 */
public class textStockItem
{
    public static void main(String[] args){
        StockItem ST = new StockItem(2, "ali" ,20.0,0);
        ST.setPrice(20.0);
        ST.setTotalnumber(2);
        System.out.println("calculated total value is: " + ST.calculatevalue());
        System.out.println(ST.toString());
        
        
        
        
    
    }
}
