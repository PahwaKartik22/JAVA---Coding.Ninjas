package asnmentConditionLoop;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String args[])
    { Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long x = 0,i = 1; 
      if ((0<=n)&&(n<=100000))
      while (n!=0)
      { int t = n%2;
        x = x + t*i;
        n/=2;
        i= i*10; 
        
      }
      System.out.print(x);
      
    }
        
    }