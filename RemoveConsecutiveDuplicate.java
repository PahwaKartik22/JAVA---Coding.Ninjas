package stringAssignment;
import java.util.Scanner;
public class RemoveConsecutiveDuplicate 
{
public static void main(String args[])
{ Scanner sc = new Scanner(System.in);
  System.out.println("Please enter the string to be corrected"
  		+ "(don't give space in between any character of string)");
  String str = sc.next();
  String str1 = "";
  char check = ' '; 
  for (int i = 0; i<str.length(); i++)
    { if (check != str.charAt(i))
       { check = str.charAt(i);
         str1 = str1 + str.charAt(i);
       }
    }
  System.out.println(str1.substring(0));
}
}
