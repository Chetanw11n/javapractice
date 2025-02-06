import java.util.Scanner;
class LoanCalculator
{
	public static void main (String [] agrs){
		
	Scanner sc = new Scanner (System.in);
	
	System.out.println(" Loan Calculator   ");
	System.out.println();
	System.out.print("Enter the amount : ");
	float amount = sc.nextFloat();
	System.out.print("Enter the ROI : ");
	float roi = sc.nextFloat();
	System.out.print("Enter the tenure (months) : ");
	int months = sc.nextInt();
	
}
}