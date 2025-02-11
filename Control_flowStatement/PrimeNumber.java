// import java.util.Scanner;
// class prime {
// public static void main (String [] a)
// {
	
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter the number : ");
		// int num = sc.nextInt();
		
		// int den = 2;
	
		// while (den<num)
			// {
				// if (num%den==0)
				// {
					// break;
				// }
				// den++;
			// }	
		
			// if( num == den)
				// System.out.println("It is a prime number ");
	
			// else  
				
				// System.out.println("It is not a prime number ");
	// }
// }


import java.util.Scanner;
class prime {
public static void main (String [] a)
{
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		int den = 2;
	
		while (den<num)
			{
				if (num%den==0)
				{
					break;
				}
				den++;
			}	
		
			if( num == den)
				System.out.println("It is a prime number ");
	
			else  -
				System.out.println("It is not a prime number ");
	}
}