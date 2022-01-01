import java.util.Scanner;
class Arithmatic
{
    public static void main(String args[])
     {
        int a,b,sum,sub,mul,div,mod;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of a :-");
        a=sc.nextInt();

        System.out.println("Enter the value of b :-");
        b=sc.nextInt();

        sum=a+b;
        sub=a-b;
        mul=a*b;
        div=a/b;
        mod=a%b;

        System.out.println("Addition of " +a+ " and " +b+ " is = "+sum);
        System.out.println("Subtraction of " +a+ " and " +b+ " is = "+sub);
        System.out.println("Multiplication  of " +a+ " and " +b+ " is = "+mul);
        System.out.println("Division of " +a+ " and " +b+ " is = "+div);
        System.out.println("Remainder of " +a+ " and " +b+ " is = "+mod);

    }
}