package arraysAssignment;
import java.util.Scanner;
public class SumOfTwoArrays {

	public static int[] AddArrays(int input1[],int input2[])
	{ int input[]= new int[input1.length+1]; boolean check= true; 
	  int i = input1.length-1, j= input2.length-1,k= input.length-1;
		for (;j>=0;j--)
	   { int w = input1[i]+input2[j];
		 if (w>9&&check==true)
	     { input[k]= w%10; check=false; k--; i--;}
		 else if (w<=9&&check==true)
	     { input[k]= w; k--; i--;}
		 else if (w+1<=9&&check==false)
	     { input[k]= w+1; check=true; k--; i--;}
		 else if (w+1>9&&check==false)
	     { input[k]= (w+1)%10; k--; i--; check=false;}
	   }
		for(;j<0&&i>=0;i--,k--)
		{ if (check==true) {input[k]= input1[i];}
		  if (check==false&&input1[i]+1>9&&(i-1)!=0) 
		  { input[k]= (input1[i]+1)%10;} 
		  if (check==false&&input1[i]+1<=9&&(i-1)!=0) 
		  { input[k]= (input1[i]+1);check=true;} 
		}
		
		if (j<0&&i<0&&check==false)
		{ input[k]=1;}
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
	          { int input1[]= takeInput(n);
	            int m = sc.nextInt();
	            if ((0 <= m)&&(m <= 100000)&&n>=m)
	             { int input2[]= takeInput(m);
	             int arr[]= AddArrays(input1,input2);
	             print(arr);
	             }
	            if ((0 <= m)&&(m <= 100000)&&n<m)
	             { int input2[]= takeInput(m);
	             int arr[]= AddArrays(input2,input1);
	             print(arr);
	             }
	          }
	       }
	    }  
	}
}
