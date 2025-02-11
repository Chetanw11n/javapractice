class factorialdigitNumber
{
	public static void main (String [] s)
	{
		int num = 123456;
		int dup = num;
		int sum = 0 ;
		while(num >0)
		{
			int rem = num %10;
			if (rem%2!=0)
			{				
				int fact = 1 ;
				for(int i = rem ; i>=1 ;i--)
				fact *=i ;
			sum +=fact ;
			System.out.println("odd number are : " +rem);
			}
			num/=10;
		}
			System.out.println(dup);
			System.out.println("Sum of fact of digit is : "+ sum);	
	}
}