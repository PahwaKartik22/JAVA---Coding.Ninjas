package arraysAssignment;
import java.util.Scanner;
public class Sort012 {

	public static int[] sort012(int input[])
	{ int a1 = 0;
	  int a2 = 0;
	  int a0 = 0;
	  int w  = input.length;
	  for(int i = 0; i<w; i++)
	   { if (input[i]==0)
	      { a0++;}
	     if (input[i]==1)
	      { a1++;}
	     if (input[i]==2)
	      { a2++;}
	   }
	  for (int i=0; i<a0; i++)
	   { input[i]=0;} 
	  for (int i=a0; i<a0+a1; i++)
	   { input[i]=1;} 
	  for (int i=a0+a1; i<a0+a1+a2; i++)
	   { input[i]=2;} 
	  return input;
		
	}
	
	public static int[] takeInput(int n)
	{ Scanner sc = new Scanner(System.in);
		int input[]= new int[n];
		for (int i = 0; i< n;i++)
	   { input[i]=sc.nextInt();}
		return input;
	}
	
	public static void print(int input [])
	{ for(int i =0; i<input.length;i++)
	    { System.out.print(input[i]+" ");}
	}

	public static void main(String args[])
	{ Scanner sc = new Scanner(System.in);
	   int t = sc.nextInt();
	    if ((1 <= t)&&(t <= 100))
	    { for (int i=0; i<t;i++)
	       { int n = sc.nextInt();
	         if ((0 <= n)&&(n <= 100000))
	          { int arr[]= takeInput(n);
	            arr= sort012(arr);
	            print(arr);
	          }
	       }
	    }  
	}
}
