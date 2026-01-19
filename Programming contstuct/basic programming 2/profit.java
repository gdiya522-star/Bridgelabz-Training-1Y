import java.util.Scanner;
class profit{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Cost Price");
int a = sc.nextInt();
System.out.println("Enter Selling Price");
int b = sc.nextInt();
int p = b-a;
double pp = (p/a)*100;
System.out.println("profit is "+p);
System.out.println("profit percentage is "+pp);
}
}
