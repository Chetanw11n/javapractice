public class ProductOfNum{
	public static void main (String [] args)
	{
	int num = 8888;
	int rem = 0;
	int pro = 1;
		
		rem = num%10;
		num = num/10;
		pro = pro*rem;
		
		rem = num%10;
		num = num/10;
		pro = pro*rem;
		
		rem = num%10;
		num = num/10;
		pro = pro*rem;
		
		rem = num%10;
		num = num/10;
		pro = pro*rem;
		
		
	//  System.out.println(rem);
	//	System.out.println(num);
		System.out.println("product of 4 digit no. is: "+pro);
	}
}
		