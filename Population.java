import java.util.Scanner;
public class Population
{
public static void main (String[] args)
{
	long currpop = 312032486l;
	final long seconds = (365*24*60*60)*5;
	long birth = seconds/7;
	long death = seconds/13;
	long imm = seconds/45;
	
	System.out.println("Total no. of birth in 5yr :" + birth);
	System.out.println("Total no. of death in 5yr:" +death);
	System.out.println("Total no. of imm in 5yr:" + imm);
	long newPop = currpop+birth- death+imm;
	System.out.println("Current pop is :" + currpop);
	System.out.println("New pop is : " +newPop);
	
	}
	}