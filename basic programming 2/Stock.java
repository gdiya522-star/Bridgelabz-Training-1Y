import java.util.Scanner;
public class Stock {
    public static void main(String arg[]){
        Scanner mrp=new Scanner(System.in);
        System.out.println("Enter the unitprice of an item : ");
        int up=mrp.nextInt();
        System.out.println("Enter the quantity of item : "); 
        int qt=mrp.nextInt();
        int pp=up*qt;
        System.out.print("The total purchase price of items is :INR ₹"+pp );
       System.out.print(" if the quantity "+qt );
     System.out.print(" and Unit Price is "+up );

    }
    
}

