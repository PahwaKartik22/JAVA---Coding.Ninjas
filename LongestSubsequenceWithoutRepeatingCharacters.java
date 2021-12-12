package stringAssignment;

import java.util.Scanner;

public class LongestSubsequenceWithoutRepeatingCharacters {
	public static void main(String args[])
	{ Scanner sc = new Scanner(System.in);
	  String s = sc.nextLine();
	  String str1 = "";
      String str2 = "";
      for (int i=0; s.length()>0;)
      {  str2="";
        str1= str1 + s.charAt(i);
           for (int j=1;j<s.length();j++)
           {
               if (s.charAt(i)!=s.charAt(j))
               { str2 = str2 + s.charAt(j);}
           }
        s= str2;
      }
         
	     System.out.print(str1.length());
	}
}
