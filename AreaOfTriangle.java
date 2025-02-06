import java.util.Scanner;
public class AeraOfTriangle{

public static void main (String[] args)
{
	Scanner sc = new Scanner(System.in);

	
	System.out.print("Enter the base: ");
	float b = sc.nextFloat();
	
	System.out.print("Enter the height: ");
	float h = sc.nextFloat();
	
	
	float a = 0.5f*(b*h);
	
	System.out.print("Area of triangle is: "+a );
	
	
	}
	
}