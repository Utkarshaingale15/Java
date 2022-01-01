
import java.util.Scanner;
import java.util.Arrays;

class Anagramstring
{
    public static void main(String args[]) 
    {
       String s1,s2;
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the first string :- ");
       s1=sc.nextLine();

       System.out.println("Enter the second string :- ");
       s2=sc.nextLine();
       sc.close();

       s1=s1.toLowerCase();
       s2=s2.toLowerCase();

        if (s1.length() != s2.length()) 
        {  
            System.out.println("Both the Strings are not Anagram");  
        }
        else
        {
            char str1[]=s1.toCharArray();
            char str2[]=s2.toCharArray();

            Arrays.sort(str1);  
            Arrays.sort(str2);  

            if(Arrays.equals(str1, str2) == true) 
            {  
                System.out.println("Both the Strings are Anagram");  
            } 

            else 
            {  
                System.out.println("Both the Strings are not Anagram");  
            }  

        }  

    }
}


OUTPUT :-

    
PS F:\Java> javac Anagramstring.java
PS F:\Java> java Anagramstring
Enter the first string :- 
Enter the second string :-
Tan
Both the Strings are Anagram
PS F:\Java> java Anagramstring
Enter the first string :- 
pen
Enter the second string :-
net
Both the Strings are not Anagram


