package asnmentConditionLoop;

import java.util.Scanner;

public class ChoiceMultiplyOrAdd {
	public static void main(String args[])
	{ Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int c = sc.nextInt();
	 int i = 1;
	 int sum=0;
	 int mul=1;
	 if ((1 <= n)&&(n <= 12))
	{ 
		if (!((c==1)||(c==2)))
		{ 
			System.out.print("-1");
			
		}
		else if (c==1)
		{ for (sum=0;i<=n;i++)
		    { sum=sum+i;}
		  System.out.print(sum);
		  
		}
		else 
		{  for (mul=1;i<n;i++)
		    { mul=mul*i;}
		  System.out.print(mul);
		}
	}
	}
	}
