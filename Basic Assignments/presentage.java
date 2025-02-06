import java.util.Scanner;
public class presentage
{
	public static void main (String [] agrs)
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks: ");
		float marks = sc.nextFloat();
		
		float pre = (marks*100)/600;
		
		String op = 	(pre>=75)?"Grade A with "+pre+"%":
						(pre>=60)?"Grade b with "+pre+ "%":
						(pre>=35)?"Grade c with "+pre+ "%":
						 "% fail";
		System.out.print(op);
		
		
		}
	}
		