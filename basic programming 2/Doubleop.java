import java.util.Scanner;
public class Doubleop{
    public static void main(String arg[]){
        Scanner op=new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        double a=op.nextDouble();
        System.out.println("Enter the value of b : ");
        double b=op.nextDouble();
        System.out.println("Enter the value of c : ");
        double c=op.nextDouble();
        double q=a + b *c;
        double r= a * b + c;
        double s=c + a / b;
        double  u=a % b + c;
        System.out.println("The value of a + b * c :  "+q);
        System.out.println("The value a * b + c : "+r);
        System.out.println("The value c + a / b : "+s);
        System.out.println("The value a % b + c : "+u);
    }
}
