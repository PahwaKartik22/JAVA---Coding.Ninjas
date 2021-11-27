package functionVariablesAndTheirScope;
import java.util.Scanner;
public class FibonacciSeriesFunction 
{ public static boolean Fibonacci(int n) 
{ int i=1,j=0;
while (i<n)
	   { int sum=i+j;
       j = i;
       i = sum;
     }
       if ( i == n)
        { return true; }
       else 
        { return false; }
       
}
public static void main(String args[])
{ Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
boolean ansFibonacci = Fibonacci(n); 
System.out.print(ansFibonacci);
}
}