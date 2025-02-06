import java.util.Scanner;

class TableOfNum {
public static void main( String [] args)
{
	Scanner sc= new Scanner(System.in); 
	System.out.println("Enter Number : ");
	int num = sc.nextInt();
	System.out.println("Enter Range: ");
	int range = sc.nextInt();
	int i ;
	int mul;
  
  
	for(i=1;i<=range; i++)
		{
			
			mul=num*i;
			System.out.println( num + " * " + i + " = " + mul);
		}  
}}

