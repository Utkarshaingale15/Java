//Java program to calculate Fibbonacci series upto n number of terms
import java.util.*;

public class Fibbonacci2
{
    public static void main(String[] args) 
    {
		int t1 = 0, t2 = 1,i = 1,sum;
        Scanner sc=new Scanner(System.in);
      
        System.out.println("Enter the number of terms :- ");
        int n=sc.nextInt();  
		sc.close();

        System.out.println("First " + n + " terms of Fibbonacci series are :- ");
        
        while (i <= n)
        {
            System.out.print(t1 + "  ");
            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            i++;
        }

    }
}


OUTPUT :-
	
	PS F:\Java> javac Fibbonacci2.java
PS F:\Java> java Fibbonacci2      
Enter the number of terms :- 
10
First 10 terms of Fibbonacci series are :- 
0  1  1  2  3  5  8  13  21  34
	
	
