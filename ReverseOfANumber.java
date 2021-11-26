package asnmentConditionLoop;

import java.util.Scanner;

public class ReverseOfANumber { public static void main(String args[])
{ Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
if ((0 <= n)&&(n < 100000000))
{ while (n%10==0)
  { n/=10;
   continue;}
   
  while (n!=0)
    {int i = n%10;
	 
     System.out.print(i);
     n/=10;
    }
  }

}

}