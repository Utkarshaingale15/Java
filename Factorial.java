import java.util.Scanner;
class Factorial{
    public static void main(String args[]) {
        int n,fact=1,i;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number :-");
        n=sc.nextInt();

        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of " +n+ " is = "+fact);
    }
}


OUTPUT :-
    
    PS F:\Java> javac Factorial.java
PS F:\Java> java Factorial
Enter the number :-
8
Factorial of 8 is = 40320
    
    
