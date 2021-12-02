package multiDimensionalArrays;

import java.util.Scanner;

public class LargestSumInRowOrColumn {
	public static int[][] takeInput(int n, int m)
	{ Scanner sc= new Scanner(System.in);
	   int arr2D[][]= new int[n][m];
	   for (int i=0; i<n; i++)
	    { for (int j=0; j<m; j++)
	       { arr2D[i][j]= sc.nextInt();}
	    }
	   return arr2D;
	}


	public static void LargestcolumnSum(int n,int m)
	{ int arr2D[][]= takeInput(n, m);
	  int arr[] = new int[n+m];
	  for (int i=0; i<m; i++)
	   { for (int j=0; j<n; j++)
	      { arr[i]= (arr2D[j][i]+arr[i]);}
	   }
	  
	  boolean check = false;
	  for (int i=m,k=0; i<n+m; i++)
	   { for (int j=0; j<m; j++)
	      { arr[i]= (arr2D[k][j]+arr[i]);}
	   }
	  int x = 0;
	  int sum = -2147483648;
	  for (int i =0; i<arr.length; i++)
	    { if (arr[i]>sum)
	      { sum = arr[i]; check = false; x= i;}
	    }
	  
	  for (int i =m; i<n+m; i++)
	    { if (arr[i]>sum)
	      { sum = arr[i]; check = true; x= i-m;}
	    }
	  if (x==0)
	   { System.out.print("row" +" " + x + " " + sum );}
	  else if (check==false)
	   { System.out.print("column" +" "+ x +" " + sum );}
	  else if (check==true)
	   { System.out.print("row" +" " + x + " " + sum );}
	  
		   
	}
	public static void main(String args[])
	{ Scanner sc = new Scanner(System.in);
	  int t = sc.nextInt();
	  int check[] = new int[t]; 
	  if (( 1 <= t)&&(t <= 100))
	  {  for (int i = 0; i<t; i++)
	   { int n = sc.nextInt();
	     check[i]=n;
	   if ((0 <= n)&&(n <= 1000))
	     {int m = sc.nextInt();
	     if ((0 <= m)&&(m <= 1000))
	     {LargestcolumnSum(n,m);} 
	   }}
	}
	}
	}

