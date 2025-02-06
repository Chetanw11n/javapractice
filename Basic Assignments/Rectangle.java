import java.util.Scanner;
public class Rectangle
{
public static void main (String[] agrs)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the width: ");
	float w = sc.nextFloat();
	System.out.println("Enter the height: ");
	float h = sc.nextFloat();
	
	float area = w*h;
	float peri = (h*w)*2;
	
	System.out.println("The of Rectangle is area " + area );
	System.out.println("The of Rectangle is peri " + peri );
}
}

	