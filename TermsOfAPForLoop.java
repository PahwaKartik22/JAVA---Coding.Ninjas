package asnmentConditionLoop;
import java.util.Scanner;
public class TermsOfAPForLoop 
{  public static void main(String args[])
{  Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
    
   for (int i =  1;i<=n;i++)
        {  int a = (3*i+2);
	       if (a%4==0)
            { 
               n++;
              continue;
            } 
           System.out.print(a+" ");
        }
}
} 