import java.util.Scanner;

	public class BytetoAll{
	
	public static void main(String [] agrs )
	{
		float b = 100;
		
	 	short s = b; // 10
		char ch = b; // Err = incompatible types: possible lossy conversion from byte to char
		int   i = b; // 10
 		long  l = b; // 10
		float f = b; // 10.0
		double d = b; // 10.0
		System.out.println(i);
		System.out.println(d);
	}
}