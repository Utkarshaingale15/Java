
import java.util.Scanner;
class Reversestring
{
    public static void main(String args[])
    {
       String str,rev="";
       int i;
       Scanner sc=new Scanner(System.in);

       System.out.println("Enter the string :- ");
       str=sc.nextLine();

       for(i=str.length()-1;i>=0;i--)
       {
           rev=rev+str.charAt(i);
       }

       System.out.println("Original String = "+str);
       System.out.println("Reverse of String = "+rev);

    }
}


OUTPUT :-
    
    PS F:\Java> javac Reversestring.java
    PS F:\Java> java Reversestring
Enter the string :-
Hello
Original String = Hello
Reverse of String = olleH

