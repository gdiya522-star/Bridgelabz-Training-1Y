import java.util.Scanner;
public class Height {
    public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the height in cm : ");
    double cm=sc.nextDouble();
    double foot=(cm/2.54)/12;
    System.out.println("The Height in foot is : "+foot);


    
}}