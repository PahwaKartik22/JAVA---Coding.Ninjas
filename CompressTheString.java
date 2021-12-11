package stringAssignment;
// note this is for compressing the whole string irrespective of consecutive alphabets
import java.util.Scanner;

public class CompressTheString 
{
	public static void main(String args[])
	{ Scanner sc = new Scanner(System.in);
	  String str = sc.next();
	  String str1 = "";
	  String str2 = "";
	  for (; str.length()>0; )
	   { int j=1;int z=0; str2="";
	     for (int k=z+1; k<str.length(); k++)
	      { if (str.charAt(z)==str.charAt(k))
	        { j++;  } 
	        if (str.charAt(z)!= str.charAt(k))
	        { str2 = str2 + str.charAt(k);} 
	      }
	     str1 = str1 + str.charAt(z) + j;
	     str = str2;  
	   }
	     System.out.print(str1);
	}
}
