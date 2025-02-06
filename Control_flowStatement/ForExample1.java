import java.util.Scanner;
class ForExample1{

	public static void main(String []args)
	{
	
		System.out.println("Numbers from 1 to 10");
		for (int i=1;i<=10;i++)
			{
				System.out.println(i + " ");
	
			}
	
		System.out.println("Characters from A to Z");
	
		for (char i= 'A';i<='Z';i++)
			{
		
				System.out.println(i + " ");
	
			}
		System.out.println("Characters from z to a");
		
		for (char i= 'z';i<='a';i--)
			{
		
				System.out.println(i + " ");
	
			}
		System.out.println("Digits");
		
		for (char i= '0';i<='9';i++)
			{
		
				System.out.println(i + " ");
	
			}	
		System.out.println(" ASCII ");
		
		for (int i=1 ;i<= 127 ;i++)
			{
		
				System.out.println( i + " : " + (char)i);
	
			}	
	
	}
}