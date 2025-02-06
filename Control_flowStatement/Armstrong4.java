import java.util.Scanner;
class Armstrong4{

	public static void main(String []args)
	{

	 int num=1 ;
	 int copyNum;
	 long sum;
	 int lastDigit;
	
	 while(num<10000){
	 
		copyNum=num;
		sum=0;
	 
		while(copyNum>0)
		{
			lastDigit = copyNum%10;
			sum+=(lastDigit*lastDigit*lastDigit*lastDigit);
			copyNum=copyNum/10;
		}
	
		if(sum==num)
			System.out.println("Num :" + num);
	
		num++;	
	}	
	}
}

