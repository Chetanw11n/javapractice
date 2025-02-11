import java.util.Scanner;

class Rajasoft
{
	public static void main (String [] s){
		
		System.out.print("Enter a number : ");
		int num = new Scanner(System.in).nextInt();
		int nprime = 0;
		int pprime = 0;
		
		for(int i = num-1 ; i>1 ; i--)
		{
			boolean flag = true;
			for (int j = 2 ; j<i ; j++)
			{
				if (i%j==0){
					flag = false;
					break;
				}

			}
			if (flag){
				pprime = i;
				break;	
			}
		}
			for(int i =num+1;;i++)
			{
				boolean flag = true;
				for(int j=2 ; j<i ;j++)
				{
					if(i%j==0)
					{
						flag = false;
						break;
					}
				}
				if (flag){
					nprime =i ;
					break;
				}
			}
				if (num-pprime<nprime-num)
					System.out.println(pprime+" "+num);
				else if(num-pprime>pprime-num)
					System.out.println(num+" "+nprime);
				else
					System.out.println(pprime+" "+num+" "+nprime);
	}
}