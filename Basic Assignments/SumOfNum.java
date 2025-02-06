
public class SumOfNum{
public static void main (String[] args){
	
	System.out.println("Enter a number between 0 And 1000:" );
	int num = 9899;
	int temp = 0;
	int evensum = 0;
	int oddsum = 0 ;
	
	int rem = num%10;
		num = num/10;
	temp = (rem%2==0)? (evensum=evensum+rem):(oddsum=oddsum+rem);
		rem = num%10;
		num = num/10;
		
	temp = (rem%2==0)? (evensum=evensum+rem):(oddsum=oddsum+rem);
		rem = num%10;
		num = num/10;
		
    temp = (rem%2==0)? (evensum=evensum+rem):(oddsum=oddsum+rem);
		rem = num%10;
		num = num/10;
		
    temp = (rem%2==0)? (evensum=evensum+rem):(oddsum=oddsum+rem);
    System.out.println("Evensum  "+ evensum);
    System.out.println("Oddsum  "+oddsum);
	System.out.println("Total sum = " + (evensum+oddsum));

	}
}