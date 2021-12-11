package stringAssignment;
import java.util.Scanner;
public class ReverseEachWord {
public static void main(String args[]) 
{ Scanner sc= new Scanner(System.in);
  String str = sc.nextLine();
  for (int i = 0; i<str.length();i++ )
   {  int j = i;int k =i;
	  for (; str.charAt(j)!= ' ' && j<str.length()-1; j++)
       { }
	 i=j;
	 int z = j-1;
	 if (j==str.length()-1) {z=j;}
	  for (;z>=k;z--)

	   {
		  System.out.print(str.charAt(z));
	   }
	  
	  System.out.print(" ");
   }
	  
}
}
