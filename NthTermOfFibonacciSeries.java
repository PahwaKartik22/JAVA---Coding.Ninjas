package lec2cont;

import java.util.Scanner;

public class NthTermOfFibonacciSeries {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int j  = 0;
         int k = 1;		  
         if ((n<=25)&&(n>=1))
    {
         for (int i = 1;i<=n;i++)
         { 
          int w = j+k;
          j=k;
          k=w;
          
         }
         System.out.print(j);
         
    }
   }    
   }