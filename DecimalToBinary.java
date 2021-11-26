import java.util.Scanner;
public class DecimalToBinary
{
    
    public static void main(String[] args) 
{
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =17;i>=0;i--)
        {
            int r = n>>i;
            
            if((r&1)>0)
            {
                System.out.print("1");
            
            }
            else 
            {
                System.out.print("0");
            }
        }
        
}
}