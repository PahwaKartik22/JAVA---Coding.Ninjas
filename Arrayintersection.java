package arrayUse;
import java.util.Scanner;
public class Arrayintersection {
public static int[] takeInput(int n)
{Scanner sc = new Scanner(System.in);
int input[] = new int[n];
for ( int i = 0; i<n; i++)
{ input[i]= sc.nextInt();
}
return input;
}

public static void print(int input[])
{ for (int i= 0; i<input.length; i++)
{ if (input[i]!=0)
	{System.out.print(input[i] + " ");}
}
}
 
public static int[] IntersectionFinder(int input1[],int input2[])
{  int n = 0;
   int k = 0;
   if (input1.length<=input2.length)
   { n= input2.length;}
   else if (input1.length>=input2.length)
   { n= input1.length;}
	int arrIntersection[]= new int[n];
	if (input1.length>=input2.length)
	{ for (int i=0; i<input2.length; i++)
	   {   boolean check=false;
		for (int j =0; j< input1.length; j++ )
       { if (input1[j]==input2[i])
       { check = true;
         arrIntersection[k] = input1[j];
         k++;
         break;
       }
       }
	   }
	}
	
	else if (input1.length<=input2.length)
	{ for (int i=0; i<input1.length; i++)
	   {   boolean check=false;
		for (int j =0; j< input2.length; j++ )
    { if (input2[j]==input1[i])
    { check = true;
      arrIntersection[k] = input2[j];
      k++;
      break;
    }
    }
	}}
   return arrIntersection;
}

public static void main(String args[])
{ Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
if ((1 <= t)&&(t <= 100))
{
for (int i=0;i<t ; i++)
{ int m = sc.nextInt();
  if ((0 <= m)&&(m <= 10000))
  {
   int arr2[] = takeInput(m);
   int n = sc.nextInt();
   if ((0 <= n)&&(n <= 10000))
   {
    int arr3[] = takeInput(n);
     int arr4[] = IntersectionFinder(arr2,arr3);
     print(arr4);
   }
  }
}
}		
}
}


