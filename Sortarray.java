
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
