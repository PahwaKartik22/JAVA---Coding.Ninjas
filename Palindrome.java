package stringUse;
import java.util.Scanner;
public class Palindrome {
	public static void main(String args[])
 {Scanner sc = new Scanner(System.in);
 String str = sc.next();
 boolean pal = false;
 for (int i = 0,j=str.length()-1; i<str.length(); i++,j-- )
   { if (str.charAt(i)==str.charAt(j))
     { pal=true;}
    if (str.charAt(i)!=str.charAt(j))
     { pal=false; break;}
   }
 
 System.out.print(pal);
 }
 }
