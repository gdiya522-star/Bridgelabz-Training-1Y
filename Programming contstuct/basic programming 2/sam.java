import java.util.Scanner;
class Sam{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Maths Marks");
int a = sc.nextInt();
System.out.println("Enter Physic Marks");
int b = sc.nextInt();
System.out.println("Enter Chemistry Marks");
int c=  sc.nextInt();
double average = (a+b+c)/3;
System.out.println("average is "+average);
}
}