import java.util.Scanner;
public class AllPrimeNumbers
{ public static void IsPrime(int n)
{    int i =2;
	for (i =2;i<n;i++)
    { int k = n%i;
       if (k==0)
      { return; }
    }
   if (i==n)
      { System.out.print(n+" "); }
}
public static void main(String args[])
{ Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  for (int x = 2;x<=n;x++)
      { IsPrime(x); }
}
}