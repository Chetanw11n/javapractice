import java.util.Scanner;
public class Circle
{
public static void main (String[] args)
{
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter radius in (cm) : " );
	float r = sc.nextFloat();
	final float pi = 22/7;
	float Area = pi*(r*r);
	float peri = 2*pi*r;
	System.out.println("Area of circle is "+ Area);
	System.out.println("perimeter of circle is "+ peri);
	
	  }
}
