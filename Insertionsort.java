
import java.util.Scanner;

class Insertionsort
{
    public static void main(String args[])
    {
        int n, i, j, element;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the Size of Array :- ");
        n = scan.nextInt();
        int a[] = new int[n];

        System.out.println("Enter those " +n+ " Elements :- ");

        for(i=0; i<n; i++)
        {
            a[i] = scan.nextInt();
        }

        System.out.println("Array before Insertion sort is :-");
        for(i=0; i<n; i++)  
        {  
            System.out.print("  " +a[i]);      
        }  
      
        System.out.println("");
        System.out.println("Applying Insertion Sort Technique to the array"); 

        for(i=1; i<n; i++)
        {
            element = a[i];
         
            for(j=(i-1); j>=0 && a[j]>element; j--)
                a[j+1] = a[j];
                a[j+1] = element;
        }

        System.out.println("Array after Insertion sort is :-");  
        for(i=0; i<n; i++)  
        {  
           System.out.print(a[i]+ "  ");  
        }

    }           
}
