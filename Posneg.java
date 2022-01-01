import java.util.Scanner;
class Posneg
{
    public static void main(String[] args) 
    {
        int n;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of n :-");
        n=sc.nextInt();

        if(n>0)
        {
            System.out.println(+n+ " is positive number");
        }
        else if(n<0)
        {
            System.out.println(+n+ " is negative number");
        }
        else
        {
            System.out.println("Entered number is zero");
        }

    }
}


OUTPUT :-
    
    
     PS F:\Java> javac Posneg.java
PS F:\Java> java Posneg
Enter the value of n :-
7
7 is positive number
PS F:\Java> java Posneg
Enter the value of n :-
-9
-9 is negative number
PS F:\Java> java Posneg
Enter the value of n :-
0
Entered number is zero


