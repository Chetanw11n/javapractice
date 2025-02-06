import java.util.Scanner;
public class char2
{
	public static void main (String [] agrs)
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a charcter: ");
		char ch = sc.next().charAt(0);
	
		String cha	=((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))?
		((ch>='a'&&ch<='z')?(ch+ " is a lowercase Alphabet"):(ch+ " is an UpperCase Alphabet")):
				((ch>='0'&&ch<='9')?(ch+ " is a digit"):(ch+ " is a special character"));
		System.out.println(cha);
		
		// System.out.println((ch>=65 && ch<=90 ? (ch +"is a UpperCase "):(ch +"is not a uppercase")));
	}
}
	
		