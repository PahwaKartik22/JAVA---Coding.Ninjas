import java.util.Scanner;
public class StarDiamondPattern
{    public static void main(String args[])
{ Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i = 1;
    int k = 1;
    if ((n<=49)&&(n>=0)&&(n!=0))
   { while (i<=((n+1)/2))
     { int j = 1;
       while (j<=(((n+1)/2)-i))
        { System.out.print(" ");
          j++;
        }
       j=1;
       while (j<=2*i-1)
        { System.out.print("*");
          j++;
        }
       System.out.println();
       i++;
     }
      while ((i>(n+1)/2)&&(i<=n))

      { int space = 1;
        while (space<=k)
          { System.out.print(" ");
            space = space +1;
          }
        int a = (n-(2*k));
         while (a>=1)
          { System.out.print("*");
            a--;
          }
         System.out.println();
         i++;
         k++;
      }   
   }     
}
}