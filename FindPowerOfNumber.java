package asnmentConditionLoop;
import java.util.Scanner;
public class FindPowerOfNumber {
public static void main(String args[])
{Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int mul = x;
// or int mul = 1; (than use (i<=n))
if ((0 <= x)&& (x <= 8));
{int n = sc.nextInt();
if ((0 <= n)&&(x <= 9));
{ int i = 1;
 while (i<n)
 { mul = (mul*x);
 i = (i+1);
 }
 System.out.print(mul);
}
}
}
}
