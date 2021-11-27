package asnmentConditionLoop;

import java.util.Scanner;

public class CheckNumberSequence {  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int n1 = sc.nextInt();
    int way = 0;
    boolean check = true;
    for (int n2; (n-1)!=0; n--,n1=n2)
    { n2 = sc.nextInt();
      if (n2-n1>0&&way==0)
      {  way = 1;}
      else if (n2-n1<0&&way==0)
      { way = 0;}
      else if (n2-n1<0&&way==1)
      { check = false;}
      else if (n2-n1==0)
      { check = false;}
      
    }
    System.out.print(check);
}
}