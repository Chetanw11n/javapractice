import java.ut
il.Scanner;
public class ConPtoK{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		//String num1 = ((num%2==0)?((num%==2&&num%==5):("hiTwoHiFive"):("hi Two")):((num%5==0)?("hi five"):("_"));
		
		String num1 = (num%2==0||num%5==0)?((num%2==0&&num%5==0)?("hiTwoHiifive"):(num%2==0)?"hiTwo":"hifive"):("blank");
		System.out.println(num1);
		}
		}
			
			
