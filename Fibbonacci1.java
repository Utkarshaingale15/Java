//Java program to find Fibbonacci series upto n number
import java.util.Scanner;

public class Fibbonacci1
{
    public static void main(String[] args) 
    {
        int n, a = 0, b = 0, c = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n :- ");
        n = sc.nextInt();
		sc.close();

        System.out.println("Fibonacci Series upto " +n+ " :- ");

        for(int i = 1; i <= n; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+"  ");
        }

    }
}
