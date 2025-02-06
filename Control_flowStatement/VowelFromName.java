import java.util.Scanner;

class VowelFromName{
	public static void main (String [] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print(" Enter the Name : ");
	String name= sc.next().toUpperCase();
	System.out.println(name);
	System.out.print("The vowel in the string : ");
	
    
	for(int i=0 ; i<name.length();i++)
	{
		if( name.charAt(i)== 'A' || name.charAt(i)== 'E'|| name.charAt(i)== 'O'|| name.charAt(i)== 'I'|| name.charAt(i)== 'U')
			System.out.print( name.charAt(i) + " ");
	}


	
	}


}