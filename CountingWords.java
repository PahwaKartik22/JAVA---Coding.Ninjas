package stringUse;

import java.util.Scanner;

public class CountingWords {
	public static void main(String args[])
	{ Scanner sc = new Scanner(System.in);
	  String str = sc.nextLine();
	  int j=0;
	  for (int i =0; i<str.length(); i++)
	   { if (str.charAt(i)==' ')
	      { j++;}
	   }
	  if (str.length()>0)
	  {System.out.println(j+1);}
	  else if (str.length()==0)
	  {System.out.println("0");}
	}
	}