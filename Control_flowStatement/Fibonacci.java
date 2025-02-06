import java.util.Scanner;
       
 //0 1 1 2 3 5 8 13 24 …
         
class Fibonacci{
	public static void main(String[]args) 
	{
		
	    Scanner sc= new Scanner(System.in);
		System.out.print("Enter the range : ");
		int num= sc.nextInt();
		
	// 1 2 3 4 5 6 7 8 9 10
	// 0 1 1 2 3 5 8 13 24 ….
		int firstTerm=0;
		int secondTerm=1;
		int thirdTerm,i;
		System.out.print(firstTerm + " " );
		System.out.print(secondTerm + " ");
		
		for(i=1; i<=num-2; i++)
		{
			
			thirdTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = thirdTerm;
			
			System.out.print(thirdTerm + " ");
	    }
	}
} 