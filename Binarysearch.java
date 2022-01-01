import java.util.Scanner;

class Binarysearch
{
    public static void main(String args[])
    {
        int n,c,a[],first,last,mid,search;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of elements :-");
        n=sc.nextInt();
        a=new int[n];

        System.out.println("Enter those "+n+" elements :-");

        for(c=0;c<n;c++)
        a[c]=sc.nextInt();

        System.out.println("Enter the element to find :-");
        search=sc.nextInt();

        first=0;
        last=n-1;
        mid=(first+last)/2;

        while(first<=last)
        {
            if(a[mid]<search)
            first=mid+1;

            else if(a[mid]==search)
            {
                System.out.println(search + " is present in the array at location " + (mid + 1));
                break;
            }
            else
            {
                last=mid-1;
            }
            mid=(first+last)/2;
        }
        if(first>last)
        {
            System.out.println(search+" is not present in the array");
        }
     
        
    }
}