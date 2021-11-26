package asnmentConditionLoop;

import java.util.Scanner;

public class BinaryToDecimal { public static void main(String args[])
{ Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int binary = 0;
int i = 1;
if ((0<=n)&&(n<=1000000000))
  { while (n/10!=0)
    { 
	  if ((n%10==0)||(n%10==1))
	  {
	  binary = (binary + (n%10)*i);
      n/=10;
      i=i<<1;
	  }
      
    }
     if ((n/10 == 0) && ((n%10==0)||(n%10==1)))
       { 
         binary = (binary + (n%10)*i);
         
       }
  System.out.print(binary);
  }
}

}
	

