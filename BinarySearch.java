package searchingSorting;
import java.util.Scanner;
public class BinarySearch {
public static int[] takeInput(int n)
{ Scanner sc = new Scanner(System.in);
  int input[] = new int[n];
  for (int i = 0; i<n; i++)
  {  input[i]= sc.nextInt();
  }
  return input;
}

public static int binarySearch(int input[],int x)
{   int count = -1;
	int start = 0, end = input.length;
	for(int k = 0; k<input.length; k++)
	{ int i= ((start+end)/2);
		if (input[i]> x)
	    { end = i; start=0;
	    }
	    else if (input[i]<x)
	    { end = input.length; start = i;} 
		else if (input[i]==x)
	    { count = i; break;}
	    else if (start==end)
		{ break;}
	}
	return count;
}

public static void main(String args[])
{ Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  if ((0 <= n)&&(n <= 1000000))
  {int arr[] = takeInput(n);
  int t = sc.nextInt();
  if ((1 <= t)&&(t <= 10000))
  {int arr1[] = new int[t];
  for (int i = 0; i<t; i++)
  { int x =sc.nextInt();
    if ((0 <= n)&&(x <= 1000000000))
    {arr1[i]= binarySearch(arr,x);
  }}
  for (int i = 0; i<t; i++)
  { System.out.println(arr1[i]);
  }}}
}
}
