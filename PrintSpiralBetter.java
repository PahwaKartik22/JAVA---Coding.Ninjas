package multiDimensionalArrays;
import java.util.Scanner;
public class PrintSpiralBetter {
    public static void print(int arrr[])
    {
        for(int i = 0;i<(arrr.length);i++ )
        {
            System.out.print(arrr[i] + " ");
            
        }
    }
    
    public static void main(String args[])
    {
//        a. First row(left to right)
//        b. Last column(top to bottom)
//        c. Last row(right to left)
//        d. First column(bottom to top)
        
//        1
//        4 4 
//        1 2 3 4 
//        5 6 7 8 
//        9 10 11 12 
//        13 14 15 16
        
//        1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
        
        
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int arr[][] = new int[row][column];
        int arr1[] = new int[row*column];
        int count = 0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                arr[i][j] = sc.nextInt();
            }
            
        }
        int i =0;
        for(;count<row*column;i++)
        {
            int j = i,k=i+1;
        for( ;j<column-i && count<row*column;j++)
        {
            arr1[count] = arr[i][j];
        
            count++;
            
        }
        
        j = column-i-1;
        
        for(;k<row-i-1 && count<row*column;k++)
        {
            arr1[count] = arr[k][j];
            
            count++;
        }
        
        
    
        for(;j>=i && count<row*column;j--)
        {
            arr1[count] = arr[row-i-1][j];
            
            count++;
        }
        
        
        
        for(;k>i && count<row*column;k--)
        {
            arr1[count] = arr[k][i];
            
            count++;
        }
        
        
            
        }
        
        
        

        print(arr1);
}
}

