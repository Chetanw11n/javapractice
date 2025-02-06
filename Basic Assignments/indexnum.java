import java.util.Scanner;
class NumberExample {
		
		public static void main (String []args)
		{
		
		System.out.print("Enter the number : ");
		
		int num = new Scanner(System.in).nextInt();
		int dup = num ; 
		int sum = 0 ;
		
		for(;num>0;)
		{	
			int rem = num%10;
			if (rem%2==0)
				sum += rem;
			num /= 10;
			
		}
		System.out.println(sum);
		System.out.println(num);
		
}
}