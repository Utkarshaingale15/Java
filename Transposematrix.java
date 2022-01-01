
import java.util.Scanner;

public class Transposematrix
{
    public static void main(String args[])  
    {
        int i, j;
        System.out.println("Enter total rows and columns :- ");

        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int column = s.nextInt();

        int array[][] = new int[row][column];
        System.out.println("Enter the matrix :-");
        
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < column; j++) 
            {
                array[i][j] = s.nextInt();
                System.out.print("");
            }
        }

        System.out.println("The Matrix before Transpose is :- ");

        for(i = 0; i < row; i++)
        {
            for(j = 0; j < column; j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println(" ");
        }

        System.out.println("The Matrix after Transpose is :- ");

        for(i = 0; i < column; i++)   
        {
            for(j = 0; j < row; j++)
            {
                System.out.print(array[j][i]+" ");
            }
            System.out.println(" "); 
        }

    }
}


OUTPUT :-
    
    
    PS F:\Java> javac Transposematrix.java
PS F:\Java> java Transposematrix
Enter total rows and columns :- 
3
2
Enter the matrix :-
2
3
4
5
6
7
The Matrix before Transpose is :- 
2 3
4 5
6 7
The Matrix after Transpose is :-
2 4 6
3 5 7
    
    
    
