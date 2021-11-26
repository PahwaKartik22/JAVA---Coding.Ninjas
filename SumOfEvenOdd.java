package asnmentConditionLoop;
import java.util.Scanner;
public class SumOfEvenOdd
{ public static void main(String args[])
{ Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
if ((0<=n)&&(n<=100000000))
{
int odd = 0;
int even = 0;
while (n!=0)
{int a = (n%10);
 
if (a%2==0)
{even = (even + a);}
else if (a%2!=0)
{odd = odd + a;}
n= (int)(n/10);
}
System.out.print(even + "  " + odd);
}
}
}
