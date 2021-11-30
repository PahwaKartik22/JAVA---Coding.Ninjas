package searchingSorting;
import java.util.Scanner;
public class MergingTwoSortedArrays {
public static int[] MergingArrays(int input1[], int input2[])
{  int arr[]=new int[(input1.length) + (input2.length)];
int k= 0,i=0,j=0;
	for (k= 0; (i<input1.length)&&(j<input2.length); k++ )
   { if ((input1[i]>input2[j]))
       { arr[k]=input2[j];
         j++;
       }
      else 
       { arr[k]=input1[i];
         i++;
       }
	  
   }
	while (j<input2.length)
    { arr[k]=input2[j]; j++;k++;}
   while (i<input1.length)
    { arr[k]=input1[i]; i++;k++;}
	 return arr;
}

public static int[] takeInput(int n)
{ Scanner sc = new Scanner(System.in);
  int input[]=new int[n];
  for (int i=0;i<n; i++)
  { input[i]= sc.nextInt();
  }
  return input;
}

public static void print(int input[])
{ for (int i=0; i<input.length; i++)
{ System.out.print(input[i]+ " ");}
}


public static void main(String args[])
{ Scanner sc= new Scanner(System.in);
   int t=sc.nextInt();
   for (int i=0; i<t; i++)
   { int n1 = sc.nextInt();
     int input1[]= takeInput(n1);
     int n2 = sc.nextInt();
     int input2[]= takeInput(n2);
     int arr[]= MergingArrays(input1,input2);
     print(arr);
   }
}
}
