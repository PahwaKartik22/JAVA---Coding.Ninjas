package stringAssignment;
import java.util.Scanner;
public class RemoveCharacter 
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	  String str = sc.nextLine();
	  String str1 = "";
	  char check = sc.next().charAt(0); 
	  for (int i = 0; i<str.length(); i++)
	    { if (check != str.charAt(i))
	       { 
	         str1 = str1 + str.charAt(i);
	       }
	    }
	  System.out.println(str1.substring(0));
}
}
