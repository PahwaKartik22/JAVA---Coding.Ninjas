package arraysAssignment;
import java.util.Scanner;
public class PushingZeroesToEnd {
public static int[] takeInput(int n)
{ Scanner sc = new Scanner(System.in);
  int input[]= new int[n];
  for (int i=0;i< n;i++)
   { input[i]= sc.nextInt();
   }
  return input;
}


public static void print(int input[])
{ for (int i=0; i<input.length;i++)
   { System.out.print(input[i] + " ");
   }
}


public static int[] PushZeroes(int input[])
{   int j = 0;
	for (int i =0; i<input.length; i++)
     { if (input[i]>0)
        { input[j]=input[i]; j++;}
     }
	for (;j<input.length;j++)
	 { input[j]=0;}
	return input;
	
	
}


public static void main(String args[])
{ Scanner sc = new Scanner(System.in);
   int t = sc.nextInt();
    if ((1 <= t)&&(t <= 100))
    { for (int i=0; i<t;i++)
       { int n = sc.nextInt();
         if ((0 <= n)&&(n <= 100000))
          { int arr[]= takeInput(n);
            arr= PushZeroes(arr);
            print(arr);
          }
       }
    }  
}
}
