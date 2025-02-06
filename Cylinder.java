	import java.util.Scanner;
public class Population
{
public static void main (String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the radius of a Cylinder in (cm) : " );
	
	
	float r = sc.nextFloat();
	
	float area = 3.14f*r*r;

	float volume = area*r;
	
	System.out.println("the area is : "+ area );
	System.out.println("the volume is : "+ volume );

}
}