package arrayUse;
import java.util.Scanner;
public class TripletSum {
public static int[] takeInput(int n)
{ Scanner sc = new Scanner(System.in);
  int[] input = new int[n];
  for (int i = 0; i<n; i++)
  { input[i]= sc.nextInt();
  }
  return input;
}

public static int tripletSum(int input[],int x)
{   int count = 0;
	for (int i= 0 ; i<input.length; i++)
    { for (int k=i; k<input.length; k++)
    	for (int j = k; j<input.length; j++)
    	{ if (j==i && i==k)
    	  {  continue;}
    	else if (j==i)
    	{  continue;}
    	else if (k==i)
    	{  continue;}
    	else if (k==j)
    	{ continue;}
    	else if (x== ((input[j]) + (input[k]) + (input[i])))
    	  { count = count + 1;}
    	}
    }
	return count;
}

public static void main(String args[])
{ Scanner sc = new Scanner(System.in);
  int t = sc.nextInt();
  int arr1[]= new int[t];
  if ((1 <= t)&&(t <= 50))
  { for (int i = 0; i<t; i++)
     { int n = sc.nextInt();
     if ((0 <= n)&&(n <= 1000))
       {int arr[]= takeInput(n);
        int x= sc.nextInt();
        if ((0 <= x)&&(x <= 1000000000))
        {
            arr1[i]= tripletSum(arr,x);
        }
       }
       
     }
  }
  for (int i = 0;i<t;i++)
  { System.out.println(arr1[i]);
  }
}
}
