package asnmentConditionLoop;

import java.util.Scanner;

public class SquareRootOfNumber {public static void main(String args[])
	
{Scanner sc = new Scanner(System.in);  
  int n = sc.nextInt();
  int i;
  if ((0<=n)&&(n<=100000000))
  {for(i=0;i<=n/2;i++)
  {
      
      if(n==(i*i))
      { i=i;
       break; 
      }
      if ((i*i)>n)
      { i=i-1;
      break;
     }
  }
  
  System.out.println(i);
}
}
}
