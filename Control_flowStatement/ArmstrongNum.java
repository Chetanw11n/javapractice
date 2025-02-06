
import java.util.Scanner;
class Armstrong{

	public static void main(String []args)
	{

	 int num = 153;
	 int sum=0;
	 int lastDigit;
	
	 
	 while(num>0)
		 {
	 lastDigit = num%10;
	 sum+=(lastDigit*lastDigit*lastDigit);
	 num=num/10;
	 }
	
	
	 System.out.print(sum);
		
		
		
	}	
}

