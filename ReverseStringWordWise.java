package stringUse;
import java.util.Scanner;
public class ReverseStringWordWise {
public static void main(String args[])
{ Scanner sc = new Scanner(System.in);
  String str = sc.nextLine();
  String str1= "";
  int k = 0;
  for (int i =str.length()-1; i>=0 ;i--)
   { k++;
	  if (str.charAt(i)==' ')
      { for (int j = i; k>0; k--)
         { str1 = str1 + str.charAt(j);  
           j++;
         }
      }
	  if (i==0) 
	   {  str1 = str1 + ' ';
		  for (int j = i; k>0; k--)
          { str1 = str1 + str.charAt(j);  
            j++;
          }
	   }
   }
  System.out.print(str1.substring(1));
}
}
