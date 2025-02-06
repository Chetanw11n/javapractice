import java.util.Scanner;
public class tip{
public static void main (String[] args){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the Bill:" );
	float bill = sc.nextFloat();
	System.out.print("Enter the tiprate:" );
	float tiprate= sc.nextFloat();
	
	float totalAmount = (tiprate*bill)/100;
	
	float totalBill = bill + totalAmount ;
	System.out.print("the tip is " + + " and total is " +tol );

}

}	