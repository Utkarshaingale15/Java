
import java.util.Scanner;

class Palindromestring
{
    public static void main(String args[]) 
    {
       String s1;
       boolean flag=true;
       int i;

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the String :- ");
       s1=sc.nextLine();
       sc.close();

       s1=s1.toLowerCase();

       for(i = 0; i < s1.length()/2; i++)
        {    
            if(s1.charAt(i) != s1.charAt(s1.length()-i-1))
            {    
                flag = false;    
                break;    
            }    
        }    
        if(flag) 
        {   
            System.out.println("String is Palindrome");  
        }  
        else   
        { 
            System.out.println("String is not a Palindrome");   
        } 

    }
}


OUTPUt :- 
    
    
    PS F:\Java> javac Palindromestring.java
PS F:\Java> java Palindromestring
Enter the String :-
Naman
String is Palindrome
PS F:\Java> java Palindromestring
Enter the String :-
kajal
String is not a Palindrome

