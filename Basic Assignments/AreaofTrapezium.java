import java.util.Scanner;
public class AreaofTrapezium{
	
	public static void main(String [] args)
	{
	
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the a base: ");
		float a = sc.nextFloat();
		
		System.out.print("Enter the b base: ");
	
		float b = sc.nextFloat();
		System.out.print("Enter the h base: ");
		float h = sc.nextFloat();
		
		float Area = 0.5F*(a+b)*h;
		
		
		System.out.print("Area of trapezium is : " +Area);
		}
	}	
		