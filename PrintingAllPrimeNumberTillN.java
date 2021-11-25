package lec2cont;

import java.util.Scanner;

public class PrintingAllPrimeNumberTillN {
	public static void main(String args[])
	{
	    Scanner sc = new Scanner(System.in);
	    int  i = 2;
	    int n= sc.nextInt();
	    for(i=2;i<=n;i++) 
	    {
	    for(int d =2;d<i;d=d+1)
	        {
	        if(i%d==0) 
	        i++;
	        continue;
	        }
	        
	    }
	        System.out.println(i);
	        
	    }
	}
