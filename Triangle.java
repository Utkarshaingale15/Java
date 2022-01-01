//calculating the perimeter and area of triangle using static keyword

import java.util.Scanner;
class Cal
{
    static float b,h,m,n;
    void Perimeter()
    {
        float per;
        per=b+m+n;
        System.out.println("Perimeter of triangle = "+per);
    }

    void Area()
    {
        float area;
        area=(b*h)/2;
        System.out.println("Area of triangle = "+area);
    }

}
class Triangle
{
    public static void main(String args[])
     {

        Cal c1=new Cal();
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter the base of triangle :-");
        c1.b=sc.nextFloat();

        System.out.println("Enter the height of triangle :-");
        c1.h=sc.nextFloat();

        System.out.println("Enter the side of triangle :-");
        c1.m=sc.nextFloat();

        System.out.println("Enter the side of triangle :-");
        c1.n=sc.nextFloat();

        c1.Perimeter();
        c1.Area();
    }
}


OUTPUT :-
    
    
    PS F:\Java> javac Triangle.java
PS F:\Java> java Triangle
Enter the base of triangle :-
5
Enter the height of triangle :-
7
Enter the side of triangle :-
8
Enter the side of triangle :-
6
Perimeter of triangle = 19.0
Area of triangle = 17.5
    
    
    
