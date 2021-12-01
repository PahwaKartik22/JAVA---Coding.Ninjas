package arraysAssignment;
import java.util.Scanner;
public class RotateArrays {
public static int[] ArrayRotator(int input[],int d)
{ for (int i=0,save=0;i<d;i++)
   { save = input[0];
	  for (int j=0;j+1<input.length;j++)
      { input[j]=input[j+1];
	  }
	 input[input.length-1]=save; 
   }
 return input;
}

public static int[] takeInput(int n)
{ Scanner sc = new Scanner(System.in);
	int input[]= new int[n];
	for (int i = 0; i< n;i++)
   { input[i]=sc.nextInt();}
	return input;
}

public static void print(int input [])
{ for(int i =0; i<input.length;i++)
    { System.out.print(input[i]+" ");}
}

public static void main(String args[])
{ Scanner sc = new Scanner(System.in);
   int t = sc.nextInt();
    if ((1 <= t)&&(t <= 100))
    { for (int i=0; i<t;i++)
       { int n = sc.nextInt();
         if ((0 <= n)&&(n <= 100000))
          { int arr[]= takeInput(n);
            int d= sc.nextInt();
            if ((0 <= d)&&(d <= n))
            {arr= ArrayRotator(arr,d);
            print(arr);}
          }
       }
    }  
}
}
