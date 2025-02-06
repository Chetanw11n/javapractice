import java.util.Scanner;
public class vowel
{
	public static void main (String [] agrs)
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a charcter: ");
		char ch = sc.next().charAt(0);
		
		String cha	= (ch =='a'||ch == 'e'||ch == 'i'||ch=='o'||ch == 'u' ||
					ch =='A'||ch == 'E' || ch == 'I' ||ch == 'O'|| ch == 'U')?(ch + " is vowel"):(ch +" is a constant");
		System.out.print(cha);
		// System.out.println((ch>=65 && ch<=90 ? (ch +"is a UpperCase "):(ch +"is not a uppercase")));
	}
}