package arrayUse;
import java.util.Scanner;
public class LenearSearch {
	public static int[] takeInput(int size)
	{ Scanner sc = new Scanner(System.in);
		int arr[] = new int[size];
		for (int i = 0; i<size ; i++)
	    { arr[i]= sc.nextInt();      
	    }
	      return arr;
	}

	public static int linearSearch(int input[],int f)
	{ int size = input.length;
	  int i = 0;
	  for (i=0; i<size; i++)
	  { if (f==input[i])
	    { break;}
	  }
	  if (i>(size-1))
	  { i=-1;}
	  return i;
	}  

	public static void main(String args[])
	{  Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		if ((1 <= t)&&(t <= 100))
		{ int arr1[] = new int[t]; 
		  for (int i =0;i<t;i++)
		  { int n = sc.nextInt();
		    if ((0 <= n)&&(n <= 100000))
		    {
		    int arr2[] = takeInput(n);
		    int j = sc.nextInt();
		    if ((-2147483648 <= j)&&(j <= 2147483647))
		    {
		     arr1[i] = linearSearch(arr2,j);
		    }
		    }
		  }
		  for (int i =0;i<t;i++)
		  {System.out.println(arr1[i]);
		  }
		}
	}

	}
