
import java.util.Scanner;  
  
class Selectionsort
{  
   public static void main(String args[])  
   {  
       int size, i, j, temp;  
       int a[] = new int[50];  
       Scanner scan = new Scanner(System.in);  
         
       System.out.println("Enter the Size of the array :- ");  
       size = scan.nextInt();  
         
       System.out.println("Enter the Elements of the array :- ");  

       for(i=0; i<size; i++)  
       {  
            a[i] = scan.nextInt();    
       }  
       System.out.println("Array before Selection sort is :-");
       for(i=0; i<size; i++)  
       {  
            System.out.print("  " +a[i]);      
       }  
      
       System.out.println("");
       System.out.println("Applying Selection Sort Technique to the array"); 
      
       for(i=0; i<size; i++)  
       {  
           for(j=i+1; j<size; j++)  
           {  
               if(a[i] > a[j])  
               {  
                   temp = a[i];  
                   a[i] = a[j];  
                   a[j] = temp;  
               }  
           }  
       }  
         
       System.out.println("Array after Selection sort is :-");  
       for(i=0; i<size; i++)  
       {  
           System.out.print(a[i]+ "  ");  
       }  
   }  
}  


OUTPUT :-
  
  
  PS F:\Java> javac Selectionsort.java
PS F:\Java> java Selectionsort
Enter the Size of the array :- 
5
Enter the Elements of the array :- 
12
90
56
4
34
Array before Selection sort is :-
  12  90  56  4  34
Applying Selection Sort Technique to the array
Array after Selection sort is :-
4  12  34  56  90
  
  
  
