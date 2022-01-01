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
