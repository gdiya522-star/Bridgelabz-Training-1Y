import java.util.Scanner;
public class HANDshake {
    public static void main(String arg[]){
        Scanner ns=new Scanner(System.in);
        System.out.println("Enter the number of Students : ");
        int n=ns.nextInt();
        int ph=(n * (n - 1)) / 2;
        System.out.println(" The number of possible handshakes : "+ph);
    }
}