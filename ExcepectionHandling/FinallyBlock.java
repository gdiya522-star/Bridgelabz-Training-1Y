package ExcepectionHandling;

import java.util.*;
public class FinallyBlock {
    public static void main(String[]args){
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the numo");
            int numo=sc.nextInt();
            System.out.println("Enter the deno ");
            int deno=sc.nextInt();
            int div=numo/deno;
            System.out.println("divison is :- "+div);

        }catch(ArithmeticException e){
            System.out.println("plz in deno enter the postive number (zero is not allow)");
        }finally {
            System.out.println("Operation completed");
        }
    }
}