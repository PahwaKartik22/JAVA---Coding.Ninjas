package arrayUse;

import java.util.Scanner;

public class SwapNumbers {
	   public static int[] takeInput(int n)
	   { Scanner sc= new Scanner(System.in);
		   int arr1[] = new int[n];
	       for (int i = 0; i<n; i++)
	       { arr1[i]= sc.nextInt();}
	       return arr1;
	   }
	   
	   public static int[] SwapInt(int input [])
	   { int size = input.length;
	     int arr2[] = new int[size];
	     for (int i = 0,k=0;i<size;i++,k++)
	     {   if ((i%2==0) && (i==(size-1)))
	    		 { arr2[k]= input[i];}
	     else if (i%2==0 && i+1<size)
	       { arr2[k]=input[i+1];}
	     else if (i%2==1)
	       { arr2[k]=input[i-1];}
	     }
	     return arr2;
		   
	   }
	   public static void print(int Input[])
	   { int j = Input.length;
	     for (int i = 0; i<j; i++)
	     { System.out.print(Input[i] + " ");}
	     
	   }
	   public static void main(String args[])
	   { Scanner sc =new Scanner(System.in);
	   int t = sc.nextInt();
	   for (int i=1; i<=t; i++)
	   {
	      int n = sc.nextInt();
	     int arrMain[] = takeInput(n);
	     int arr3[] = SwapInt(arrMain);
	     print(arr3);
	   }
	}
	}