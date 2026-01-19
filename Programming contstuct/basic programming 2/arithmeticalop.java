import java.util.Scanner;
public class arithmeticalop{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of number1 : ");
        int a=sc.nextInt();
        System.out.println("Enter the value of number2 : ");
        int b=sc.nextInt();
        System.out.println("The Value of Sum is  : "+(a+b));
        System.out.println("The Value of Subtraction is  : "+(a-b));
        System.out.println("The Value of Multiplication is  : "+(a*b));
        System.out.println("The Value of Division is  : "+(a%b));
    }
}
