import java.util.Scanner;  
   
class Linearsearch  
{  
  public static void main(String args[])  
  {  
   int n,a[],i,search;
   Scanner sc=new Scanner(System.in);

   System.out.println("Enter the number of elements :-");
   n=sc.nextInt();
   a=new int[n];

   System.out.println("Enter those "+n+ " elements :-");

   for(i=0;i<n;i++)
   a[i]=sc.nextInt();

   System.out.println("Enter the element to find :-");
   search=sc.nextInt();

   for(i=0;i<n;i++)
   {
       if(a[i]==search)
       {
           System.out.println(search + " is present in the array at location " + (i + 1));
           break;
       }
    }
       if(i==n)
       {
            System.out.println(search + " is not present in the array");
       }

  }  
}  


OUTPUT :-
   
   
   PS F:\Java> javac Linearsearch.java
PS F:\Java> java Linearsearch
Enter the number of elements :-
5
Enter those 5 elements :-
98
12
67
9
34
Enter the element to find :-
67
67 is present in the array at location 3
PS F:\Java> java Linearsearch
Enter the number of elements :-
4
Enter those 4 elements :-
78
34
9
12
Enter the element to find :-
45
45 is not present in the array


