import java.util.Scanner;
public class ConvertCtoF{
	
	public static void main (String[] agrs){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the temperture in celsius : ");
	
	double cel = sc.nextDouble();
	
	double fah = cel*(9.0/5)+32;
	
	System.out.println("Enter a degree in celsius is " + cel);
	System.out.println(+ cel + " Celsius is " + fah + " Fahrenheit ");
	}
}