import java.util.Scanner;
public class EvenOdd{

public static void main (String [] agrs)
	{
		System.out.println("Enter the no.: ");
		int num =  new Scanner(System.in).nextInt();
		System.out.println((num/2)==(num/2.0));
		System.out.println(num%2==0);	
		System.out.println((num/2)*2==num);
	}
	
}