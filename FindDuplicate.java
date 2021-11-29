package arrayUse;
import java.util.Scanner;
public class FindDuplicate {
public  static int[] takeInput(int n)
{ Scanner sc = new Scanner(System.in);
    int arr1[] = new int[n];   
    for (int i = 0; i<n; i++)
       {  arr1[i]=sc.nextInt();
       }
      return arr1;
}

public static int Duplicate(int input[])
{  int duplicate = 0;
   boolean check;
   for (int i = 0; i<input.length; i++)
   { check = false; 
        for (int j =0; j< input.length; j++ )
        { if (j == i)
           { j++;
             continue;
           }
          if (input[j]==input[i])
           { check = true;
             break;
           }
        }
          if (check == true)
          { duplicate = input[i];}
          
    }
          return duplicate;
   }

public static void main(String args[])
{ Scanner sc = new Scanner(System.in);
  int t = sc.nextInt();
  if ((1 <= t)&&(t <= 100))
  {
  int arr1[] = new int[t];
  for (int i=0;i<t ; i++)
  { int n = sc.nextInt();
    if ((0 <= n)&&(n <= 1000))
    {
     int arr2[] = takeInput(n);
      arr1[i] = Duplicate(arr2);
    }
  }
  for (int i = 0; i<t;i++)
  { System.out.println(arr1[i]);
  }
  }		
}
}
