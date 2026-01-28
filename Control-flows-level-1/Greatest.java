import java.util.Scanner;
class Greatest
{
public static void main(String args[]){
Scanner C=new Scanner(System.in);
System.out.println("Enter the first number (a): ");
int a =C.nextInt();
System.out.println("Enter the first number (b): ");
int b=C.nextInt();
System.out.println("Enter the first number (c): ");
int c =C.nextInt();
if (a>b&&a>c){
System.out.println("THE GREATEST NUMBER IS : "+a);}
else if(b>a&&b>c){
System.out.println("THE GREATEST NUMBER IS: "+b);}

else{
System.out.println("THE GREATEST NUMBER IS : "+c);}


}}