package arrayUse;
import java.util.Scanner;
public class ReturnArraySum {

public static int[] takeinput(int size)
{ Scanner sc = new Scanner(System.in);
  int arr[] = new int[size];
	for (int i = 0; i<size; i++)
	{  
		arr[i] = sc .nextInt();
	}
	return arr;
    }
	
	public static int sum(int arr[])
	{   int size = arr.length;
	    int Sum = 0;
		for (int i=0; i<size;i++)
		{ Sum = Sum + arr[i];
		}
		return Sum;
	}
	public static void main(String args[])
{ Scanner sc = new Scanner(System.in);
int t =  sc.nextInt();    
int arr2[] = new int[t];
  for (int i= 0 ; i<t;i++)
  { int n = sc.nextInt();
    int arr1[] = takeinput(n);
    arr2[i]=sum(arr1);
  }
  for (int i=0; i<t;i++)
  { System.out.println(arr2[i]);
  }
}  
}
