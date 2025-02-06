import java.util.Scanner;
public class presentage
{
	public static void main (String [] agrs)
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the month: ");
		String mon = sc.nextLine();
		
		
		String op =  (mon.equals( "oct")||mon.equals("nov")||mon.equals("dec")||mon.equals("jan")) ? ("winter"):
					(mon.equals("feb")|| mon.equals("mar") || mon.equals("apr")||mon.equals("may") )?("summer"):
					(mon.equals("jun" )|| mon.equals("jul") ||mon.equals("aug")||mon.equals("sep"))?("monsoon"):
					("invail month");
		System.out.print(op);
		
		
		}
	}
		