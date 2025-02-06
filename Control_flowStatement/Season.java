import java.util.Scanner;

class Season {
public static void main( String [] args)
{
Scanner sc= new Scanner(System.in);
System.out.print("Enter Month : "); 
String month= sc.nextLine().toUpperCase() ;


switch(month) 
{ 	
  case "FEBRUARY":
  case "MARCH" :
  case "APRIL" :
  case "MAY" :  
  {
	  System.out.println("Summer");
	  break;
  }
	
	case "JUNE" :
	case "JULY" :
	case "AUGUST" :
	case "SEPTEMBER" :
	{
	 System.out.println("Monsoon");	 
	 break;
	}
	
	case "OCTOBER" :
	
	{
	 System.out.println(" Autumn ");	
	 break ;
    }
	
	case "NOVEMBER" :
	case "DECEMBER" :
	case "JANUARY" :
	{
	 System.out.println(" Winter ");	
	 break ;
    }

   default :
   System.out.println(" INVALID INPUT ");
	
}

}
}