import java.io.*;
public class Rightangle{
	public static void main(String[] args) {
        int a = 3;
		int b = 4;
	
	// b = a+b;
	// a = b-a;
	//b = b-a;
	
		int	temp = a;
			   a = b;
		       b = temp;
	
		System.out.println("After Swapping");
	System.out.println(a);
	System.out.println(b);
        
	}
		
    }
