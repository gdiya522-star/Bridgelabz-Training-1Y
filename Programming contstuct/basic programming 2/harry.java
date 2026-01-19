import java.util.Scanner;
class Harry{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter birth Year");
int a = sc.nextInt();
System.out.println("Enter present Year");
int b = sc.nextInt();
int age=b-a;
System.out.println("age is"+age);
}
}
