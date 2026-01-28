import java.util.*;
class number
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a:-");
		int a=sc.nextInt();
		if (a%5==0)
		{	
			System.out.println("No is divisible by 5:");
		}
		else
		{
			System.out.println("No is not divisible by 5:");
		}
	}
}
	