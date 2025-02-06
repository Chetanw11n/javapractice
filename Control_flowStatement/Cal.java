import java.util.Scanner;
public class If{
public static void main (String [] args)
{
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter a num1: ");
	float num1 = sc.nextFloat();
	System.out.print("Enter a num2: ");
	float num2 = sc.nextFloat();
	
	System.out.print("Enter a operator: ");
	char op = sc.next().charAt(0);
	float opt = 0 ;
	
	opt =(op == '+')?num1+num2:
		(op == '-')?num1-num2:
		(op == '/')?num1/num2:
		(op == '%')?num1%num2:
		(op == '*')?num1*num2:0.00000f;
		
		String output = num1+" "+op+" "+num2 +" = "+ opt;
		
		if (!(opt == 0.00000f))
			System.out.println(output);
		}
	}

		