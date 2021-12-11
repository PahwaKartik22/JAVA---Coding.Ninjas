package stringAssignment;
import java.util.Scanner;
public class HighestOccurringCharacter 
{
public static void main(String args[])
{ Scanner sc = new Scanner(System.in);
  String str = sc.next();
  int count = 0; char result= str.charAt(0); 
  for (int i =0; i<str.length(); i++)
   { int j=0;
     for (int k=i+1; k<str.length(); k++)
      { if (str.charAt(i)==str.charAt(k))
        { j++;  }
        if (j>count)
        { count=j; result = str.charAt(i);}
      }
   }
  System.out.println(result);
}
}
