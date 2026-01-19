import java.util.Scanner;
class Assignmentoperators{
public static void main (String []args){
Scanner sc= new Scanner(System.in);
System.out.println("enter first number");
int a = sc.nextInt();
System.out.println("enter second number");
int b = sc.nextInt();
int add = a+b;
int sub = a-b;
double div = a/b;
int mod = a%b;
System.out.println("addition of given number"+add);
System.out.println("substraction of given numbers"+sub);
System.out.println("division of given numbers"+div);
System.out.println("remainder of given numbers"+mod);
}
}