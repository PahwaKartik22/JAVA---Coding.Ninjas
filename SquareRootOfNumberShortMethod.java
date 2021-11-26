package asnmentConditionLoop;
import java.util.Scanner;
public class SquareRootOfNumberShortMethod {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i*i <= n) {
            i = i + 1;
        }
        i = i - 1;
        System.out.println(i);
    }
}