package stringAssignment;
import java.util.Scanner;
public class CheckPermutation 
{
public static void main(String args[])
{   Scanner sc = new Scanner(System.in);
	String str1= sc.next();
	String str2= sc.next();
	boolean check = false;
	if (str1.length()==str2.length())
	 {for (int i=0; i< str1.length();i++)
	   { 
		 for (int j = 0; j<str2.length(); j++ )
		  { 
		    if (str2.charAt(j)==str1.charAt(i))
		     { check=true; break;}
		    else { check=false;}
		  }
		 if (check==false) {break;}
		 
	   }
	 }
	System.out.print(check);
	
}
}
