package multiDimensionalArrays;
import java.util.Scanner;
public class PrintSpiral {
	public static int[][] takeInput(int n, int m)
	{ Scanner sc = new Scanner(System.in);
		int input[][]= new int[n][m];
		for (int i = 0; i<n; i++)
		  { for (int j =0; j<m; j++)
		     { input[i][j]=sc.nextInt();}
		  }
	    return input;
	}


	public static int[] printSpiral(int n, int m)
	{ int input[][]= takeInput(n,m);
	   int arr[] = new int[n*m];
	   for (int i = 0,z=0; z<arr.length; i++)
	   { int j=0,k=n-i-1,o=n-i-1;
		   for (j =0; j<m-i-1&&z<arr.length; j++)
	        { arr[z]=input[i][j];z++;}
	       for (k=i; k<n-i-1&&z<arr.length; k++)
	        { arr[z]=input[k][j]; z++;}
	       for (o=m-i-1; o>0&&z<arr.length; o--)
	        { arr[z]=input[k][o]; z++;}
	       for (int p=n-i-1; p>1&&z<arr.length; p--)
	        { arr[z]=input[p][o]; z++;}
	   }    
	  
	   return arr;
	}


	public static void main(String args[])
	{ Scanner sc = new Scanner(System.in);
	  int t = sc.nextInt();
	  int check[] = new int[t]; 
	  if (( 1 <= t)&&(t <= 100))
	  {int arr2D[][] = new int[t][1000];
	  for (int i = 0; i<t; i++)
	   { int n = sc.nextInt();
	   if ((0 <= n)&&(n <= 1000))
	     {int m = sc.nextInt();
	     if ((0 <= m)&&(m <= 1000))
	     {int arr[]=printSpiral(n,m);   
	     check[i]=n*m;
	     for (int k =0; k<arr.length; k++)
	      { arr2D[i][k]= arr[k];}
	   }}}
	  
	  for (int i =0; i<t; i++)
	   { for (int j =0; j<check[i]; j++ )
	      { System.out.print(arr2D[i][j] + " ");}
	     System.out.println();
	   }
	}
	}
	}
