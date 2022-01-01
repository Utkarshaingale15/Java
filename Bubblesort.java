
import java.util.Scanner;

class Bubblesort
{
    public static void main(String []args)
    {
        int num, i, j, temp;
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter the size of array :- ");
        num = sc.nextInt();
        int a[] = new int[num];
        System.out.println("Enter the elements of array :- ");
 
        for (i = 0; i < num; i++) 
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Array before Bubble sort is :-");
        for (i = 0; i < num; i++) 
        {
            System.out.print("   "+a[i]);
        }
        
        System.out.println("");
        System.out.println("Applying Bubble Sort Technique to the array");

        for (i = 0; i < ( num - 1 ); i++)
        {
            for (j = 0; j < num - i - 1; j++)
            {
                if (a[j] > a[j+1]) 
                    {
                        temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                    }
            }
        }
 
        System.out.println("Array after Bubble sort is :-");
        for (i = 0; i < num; i++) 
        {
            System.out.print(a[i]+"   ");
        }
        
    }
}
