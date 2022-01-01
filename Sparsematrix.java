
import java.util.Scanner;

public class Sparsematrix
{
    public static void main(String args[])
    {
        int i, j, zero = 0, count = 0; 
        int array[][] = new int[10][10];

        System.out.println("Enter total rows and columns :- ");
        Scanner scan = new Scanner(System.in);

        int row = scan.nextInt();
        int column = scan.nextInt();

        System.out.println("Enter matrix :- ");

        for(i = 0; i < row; i++)
        {
            for(j = 0; j < column; j++) 
            {
                array[i][j] = scan.nextInt();
                System.out.print("");
            }
        }

        System.out.println("Entered Matrix is :- ");

        for(i = 0; i < row; i++)
        {
            for(j = 0; j < column; j++) 
            {
                
                System.out.print(array[i][j]+" ");  
                
            }
            System.out.println("");
        }
        
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < column; j++) 
            {
                if(array[i][j] == 0)
                {
                    zero++; 
                }
                else
                {
                    count++;
                }
            }
        }

        if(zero>count)
        {
            System.out.println("The matrix is Sparse matrix...");
        }

        else
        {
            System.out.println("The matrix is not Sparse matrix...");
        }

    }
}
