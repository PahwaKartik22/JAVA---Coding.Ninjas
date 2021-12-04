package multiDimensionalArrays;
import java.util.Scanner;
public class PrintLikeAWave {
public static int[][] takeInput(int n, int m)
{ Scanner sc = new Scanner(System.in);
	int input[][]= new int[n][m];
	for (int i = 0; i<n; i++)
	  { for (int j =0; j<m; j++)
	     { input[i][j]=sc.nextInt();}
	  }
    return input;
}


public static int[] PrintWave(int n, int m)
{ int input[][]= takeInput(n,m);
   int arr[] = new int[n*m];
   int k =0;
   for (int j =0; j<m; j++)
    { if (j%2==0)
       { for (int i = 0; i<n; i++)
          { arr[k]=input[i][j]; k++;}
       }
    else if (j%2==1)
       { for (int i=n-1; i>=0; i--)
          { arr[k]=input[i][j]; k++;}
       }
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
     {int arr[]=PrintWave(n,m);   
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
