import java.util.Scanner;

class SumOfConsecutive {
public static void main( String [] args)
{
  Scanner sc= new Scanner(System.in); 
  System.out.println("Enter Starting POint : ");
  int stPt= sc.nextInt();
  System.out.println("Enter Ending POint : ");
  int endPt= sc.nextInt();
  
  int sum=0;

  while (stPt<=endPt)
  {
   sum+=stPt;
   stPt++;
  }
  System.out.println(sum);
}}