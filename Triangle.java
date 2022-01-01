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