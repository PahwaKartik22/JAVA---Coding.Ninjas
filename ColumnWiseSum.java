package multiDimensionalArrays;

import java.util.Scanner;

public class ColumnWiseSum {
	public static int[][] takeInput(int n, int m)
	{ Scanner sc= new Scanner(System.in);
	   int arr2D[][]= new int[n][m];
	   for (int i=0; i<n; i++)
	    { for (int j=0; j<m; j++)
	       { arr2D[i][j]= sc.nextInt();}
	    }
	   return arr2D;
	}


	public static int[] columnSum(int n,int m)
	{ int arr2D[][]= takeInput(n, m);
	  int arr[] = new int[n];
	  for (int i=0; i<m; i++)
	   { for (int j=0; j<n; j++)
	      { arr[i]= (arr2D[j][i]+arr[i]);}
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
	     check[i]=n;
	   if ((0 <= n)&&(n <= 1000))
	     {int m = sc.nextInt();
	     if ((0 <= m)&&(m <= 1000))
	     {int arr[]=columnSum(n,m);   
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

