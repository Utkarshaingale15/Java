//calculating area and perimeter of trapezium using abstraction

import java.util.Scanner;
abstract class Calculate
{
    abstract void show();
}
class Perimeter extends Calculate
{
    void show()
    {
        System.out.println("Perimeter is executed through area class");
    }
}
class Area extends Calculate
{
    float a,b,h,s;
    void show()
    {
        float per;
        per=(2*s)+a+b;
        System.out.println("Perimeter of Trapezium = "+per);
        float area;
        area=((a+b)*h)/2;
        System.out.println("Area of Trapezium = "+area);
    }
}
class Trapezium
{
    public static void main(String args[])
     {
        Area ar=new Area();
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter the base of Trapezium :-");
        ar.a=sc.nextFloat();

        System.out.println("Enter the side of Trapezium :-");
        ar.b=sc.nextFloat();

        System.out.println("Enter the slant side of Trapezium :-");
        ar.s=sc.nextFloat();

        System.out.println("Enter the height of Trapezium :-");
        ar.h=sc.nextFloat();
        
        ar.show();
        
    }
}
