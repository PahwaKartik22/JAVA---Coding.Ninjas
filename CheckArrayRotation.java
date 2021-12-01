package arraysAssignment;
import java.util.Scanner;
public class CheckArrayRotation {
	public static int[] takeInput(int n)
	{ Scanner sc = new Scanner(System.in);
	  int input[]=new int[n];
	  for (int i=0;i<n; i++)
	  { input[i]= sc.nextInt();
	  }
	  return input;
	}
	
	
	public static int ChechArrrayRotation(int input[])
	{  int d = 0;
		for (int i=0; i<input.length;i++)
		 { if (input[i]>input[input.length-1])
			{if (input[i]<input[i+1])
		      { d++;}
		     if ( input[i+1]<input[i])
			  { d++; break;}
			}
		 }
		return d;
	}
	
		public static void main(String args[])
		{ Scanner sc = new Scanner(System.in);
		   int t = sc.nextInt();
		   int ans[] = new int[t];
		    if ((1 <= t)&&(t <= 100))
		    { for (int i=0; i<t;i++)
		       { int n = sc.nextInt();
		         if ((0 <= n)&&(n <= 100000))
		          { int arr[]= takeInput(n);
		            ans[i]= ChechArrrayRotation(arr);
		          }
		          }
		       for (int i = 0; i<t; i++)
		        { System.out.println(ans[i]);} 
		       }
		      
		}
}
