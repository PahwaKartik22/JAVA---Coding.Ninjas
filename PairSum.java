package arrayUse;
import java.util.Scanner;
public class PairSum {
public static int[] takeInput(int n)
{ Scanner sc = new Scanner(System.in);
	int input[]= new int[n];
  for (int i=0;i<n;i++)
  { input[i]= sc.nextInt();
  }
  return input;
}


    public static int pairSum(int input[],int x) 
    { int count = 0;
    	for (int i=0; i<input.length; i++)
       { for (int k =i; k<input.length; k++) 
          { if (k==i)
          {   continue;}
       else if (x== ((input[k])+(input[i])))
             { count = count+1;
             }
          }
       }
    	    
    	return (count);
    }
    
    public static void main(String args[])
    { Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      int arr1[]= new int[t];
      if ((1 <= t)&&(t <= 100))
      { for (int i = 0; i<t; i++)
         { int n = sc.nextInt();
         if ((0 <= n)&&(n <= 1000))
           {int arr[]= takeInput(n);
            int x= sc.nextInt();
            if ((0 <= x)&&(x <= 1000000000))
            {
                arr1[i]= pairSum(arr,x);
            }
           }
           
         }
      }
      for (int i = 0;i<t;i++)
      { System.out.println(arr1[i]);
      }
    }
    }