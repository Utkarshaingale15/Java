
import java.util.Scanner;
import java.util.Arrays;

class Sortarray
{   
    public static void main(String[] args)   
    {   
        int size,i;
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the size of the array :- ");
            size=sc.nextInt();

            int array[]=new int[size];

            System.out.println("Enter the elements of the array :- ");
            for(i=0; i<size; i++)  
            {    
                array[i]=sc.nextInt();  
            }  
            
            System.out.println("Entered elements are :- ");
            sc.close();

            for (i = 0; i < size - 1; i++) 
            {
                System.out.print(array[i] + "  ,  ");
            } 

            System.out.println(array[array.length - 1]);

            Arrays.sort(array);   
            System.out.println("Elements of array sorted in ascending order :- ");  

            for (i = 0; i < size-1; i++)   
            {       
                System.out.print(array[i]+"  ,  ");   
            }   

            System.out.println(array[array.length - 1]);
        }
    }  
}  


OUTPUT :-
    
    
    PS F:\Java> javac Sortarray.java
PS F:\Java> java Sortarray
Enter the size of the array :- 
6
Enter the elements of the array :- 
90
76
54
32
12
9
Entered elements are :- 
90  ,  76  ,  54  ,  32  ,  12  ,  9
Elements of array sorted in ascending order :-
9  ,  12  ,  32  ,  54  ,  76  ,  90
    
    
    
