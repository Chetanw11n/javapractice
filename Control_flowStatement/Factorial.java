import java.util.Scanner;

class Factorial {
public static void main( String [] args)
{
	Scanner sc= new Scanner(System.in); 
	System.out.print("Enter Number :  ");
    int num = sc.nextInt();
	int fact=1;
	
	while(num>0) {
		
		fact*=num;
		num--;
		
	}
	
	System.out.println("Factorial of num : " + fact);

}
}

// 5