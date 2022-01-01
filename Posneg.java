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