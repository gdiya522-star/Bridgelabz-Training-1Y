import java.util.Scanner;
public class pen{
public static void main(String arg[]){
Scanner sc = new Scanner(System.in);
System.out.println(x:"Pen:");
int p=sc.nextInt();
System.out.println(x:"Students:");
int s=sc.nextInt();
int d=p%s;
double e=p/s;
System.out.println("The value of remaining pen:"+d);
System.out.println("The value of pen to each student:"+e);
}
}