package stringAssignment;
import java.util.Scanner;
public class CompressTheStringForConsecutive {
	public static void main(String args[])
	{ Scanner sc = new Scanner(System.in);
	  String str = sc.next();
	  String str1 = "";
	  for (int i =0; i<str.length(); )
	   { int j=1; int k=i+1;
	     for (; k<str.length(); k++)
	      { if (str.charAt(i)==str.charAt(k))
	        { j++;  } 
	        if (str.charAt(i)!=str.charAt(k))
	        { break;}
	      }
	     str1 = str1 + str.charAt(i) + j;
	      i=k;
	   }
	     System.out.print(str1);
	}
}
