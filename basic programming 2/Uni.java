import java.util.Scanner;

public class Uni{

public static void main(String arg []) {

Scanner s = new Scanner(System.in);
System.out.println("Enter the Amount of fee: ");
int fee=s.nextInt();

System.out.println("Enter the Discount in % : ");
double dis= s.nextInt();

dis = fee * dis / 100.0; // correct calculatio
double finalFee = fee - dis;

System.out.println("The Discounted amount is : "+dis);

System.out.println("The final discounted fee is: "+finalFee);
}}