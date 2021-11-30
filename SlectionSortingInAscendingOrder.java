package searchingSorting;
import java.util.Scanner;
public class SlectionSortingInAscendingOrder {
public static int[] takeInput(int n)
{ Scanner sc = new Scanner(System.in);
    int input[] = new int[n]; 
    for (int i=0; i<n; i++)
     { input[i]=sc.nextInt();}
    return input;
}


public static void print(int input[])
{ for (int i = 0; i< input.length; i++)
   { System.out.print(input[i]+" ");}
}


public static int[] ArrangingInOrder(int input[])
{   for (int i=0; i<input.length;i++)
     { for (int k = i; k<input.length; k++)
        { if (input[i]>input[k])
           { input[i]=input[i]^input[k];
             input[k]=input[i]^input[k];
             input[i]=input[i]^input[k];
           }
        }
	   
     }
   return input;
}

public static void main(String args[])
{ Scanner sc = new Scanner(System.in);
   int t = sc.nextInt();
   for (int i = 0; i<t;i++)
   { int n= sc.nextInt();
	 int arr[]= takeInput(n);
	     arr= ArrangingInOrder(arr);
	     print(arr);
   }
}
}
