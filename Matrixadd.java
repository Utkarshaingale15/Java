
import java.util.Scanner;

public class Matrixadd 
{
    public static void main(String args[])
    {
        int p,q,m,n;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of rows in first matrix :- ");
        p = sc.nextInt();

        System.out.print("Enter number of columns in first matrix :- ");
        q = sc.nextInt();

        System.out.print("Enter number of rows in second matrix :- ");
        m = sc.nextInt();

        System.out.print("Enter number of columns in second matrix :- ");
        n = sc.nextInt();

        if (p == m && q == n) 
        {

            int a[][] = new int[p][q];
            int b[][] = new int[m][n];
            int c[][] = new int[m][n];

            System.out.println("Enter all the elements of first matrix :- ");

            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter all the elements of second matrix :- ");

            for (int i = 0; i < m; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    b[i][j] = sc.nextInt();
                }
            }

            
            sc.close();

            System.out.println("First Matrix :- ");

            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println("");
            }

            System.out.println("Second Matrix :- ");

            for (int i = 0; i < m; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    System.out.print(b[i][j]+" ");
                }
                System.out.println("");
            }

            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    for (int k = 0; k < q; k++) 
                    {
                        c[i][j] = a[i][j] + b[i][j];
                    }
                }
            }

            System.out.println("Matrix after addition :- ");

            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println("");
            }

        }

        else
        {
            System.out.println("Addition is not possible...");
        }

    }
}


OUTPUT :-
    
    PS F:\Java> javac Matrixadd.java
PS F:\Java> java Matrixadd
Enter number of rows in first matrix :- 3
Enter number of columns in first matrix :- 3
Enter number of rows in second matrix :- 3
Enter number of columns in second matrix :- 3
Enter all the elements of first matrix :- 
1
2
3
4
5
6
7
8
9
Enter all the elements of second matrix :- 
2
3
1
5
4
6
9
7
8
First Matrix :- 
1 2 3
4 5 6
7 8 9
Second Matrix :-
2 3 1
5 4 6
9 7 8
Matrix after addition :-
3 5 4
9 9 12
16 15 17
    
    PS F:\Java> java Matrixadd
Enter number of rows in first matrix :- 3
Enter number of columns in first matrix :- 4
Enter number of rows in second matrix :- 2
Enter number of columns in second matrix :- 6
Addition is not possible...
    
    
    
