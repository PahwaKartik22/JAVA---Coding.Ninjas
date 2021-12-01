package arraysAssignment;

import java.util.Scanner;

public class SecondLargestInArrayUsingSorting {
	
	public static int[] takeInput(int n)
	{ Scanner sc = new Scanner(System.in);
	  int input[]=new int[n];
	  for (int i=0;i<n; i++)
	  { input[i]= sc.nextInt();
	  }
	  return input;
	}
	
	public static int[] insertionSort(int input[])
	{ for (int i =0; i<input.length-1;i++)
	   { for ( int j=i+1,w=i; w+1>0;w--)
	      { if ((input[w]>input[j])&&j<input.length)
	         { input[j]= input[j]^input[w];
	           input[w]= input[j]^input[w];
	           input[j]= input[j]^input[w];
	           j--;
	          
	         }
	      }
	   }
	  return input;	
	}
	
	public static void main(String args[])
	{ Scanner sc= new Scanner(System.in);
	   int t=sc.nextInt();
	   int checker[]=new int[t];
	   for (int i=0; i<t; i++)
	   { int n = sc.nextInt();
	     int input[]= takeInput(n);
	     input = insertionSort(input);
	     int secondLargest=-2147483648;
	     for (int j=input.length-2;j>=0;j--)
	      { if (input[j]<input[input.length-1])
	         { secondLargest = input[j]; break;}
	      }
	     checker[i]=secondLargest; 
	   }
	   
	   for(int i = 0; i < t; i++)
	    { System.out.println(checker[i]);}
	}
}

