import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter weight in pound: ");
        double w = sc.nextDouble();
		System.out.print("Enter height in inches : ");
        double h = sc.nextDouble();
		double we = w*0.45459237; 
		double  he = h*0.0254;	
		double bmi = we/(he*he);
		System.out.print(" Bmi is:  "+bmi);
		
		}
		}