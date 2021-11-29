package arrayUse;
import java.util.Scanner;
public class Sort01 {
public static void sort01(int input[])
{ int count = 0;
  int size = input.length;
	for (int i = 0; i< size; i++)
     { if (input[i]==0)
        { count=count+1;}
     }
	input = new int[size];
	for (int i = count; i<size;i++)
	 { input[i]= 1;}
	for (int i= 0; i<size; i++)
	 { System.out.print(input[i]+" ");}
}

public static int[] takeInput(int n)
{ Scanner sc = new Scanner(System.in);
	int input[] = new int[n];
  for (int i=0; i<n; i++)
   { input[i]= sc.nextInt();
   }
    return input;
}

public static void main(String args[])
{ Scanner sc = new Scanner(System.in);
  int t = sc.nextInt();
  
  if ((1 <= t)&&(t <= 100))
  { for (int i = 0; i<t; i++)
     { int n = sc.nextInt();
     if ((0 <= n)&&(n <= 100000))
       {int arr[]= takeInput(n);
          sort01(arr);  
       }
       
     }
  }
}
}
