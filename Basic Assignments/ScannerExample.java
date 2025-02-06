import java.util.Scanner;
class ScannerExample
{
	public static void main (String[] args)
	{
		Scanner sa = new Scanner(System.in);
		System.out.print("Enter a byte: ");
		byte   a = sa.nextByte();
		System.out.print("Enter a Int: ");
		int    b = sa.nextInt();
		System.out.print("Enter a Short: ");
		short  c = sa.nextShort();
		System.out.print("Enter a Long: ");
		long   d = sa.nextLong();
		System.out.print("Enter a Float: ");
		float  e = sa.nextFloat();
		System.out.print("Enter a Double: ");
		double f = sa.nextDouble();
	  
		System.out.println("\n ");
		System.out.println("you Enter ");
		System.out.println("Byte " + a);
		System.out.println("Int " + b);
		System.out.println("Short "+c);
		System.out.println("Long "+d);
		System.out.println("Float "+e);
		System.out.println("Double "+f);
		
	}
}