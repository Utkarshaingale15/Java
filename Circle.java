//calculating perimeter and area of circle using interface

import java.util.Scanner;
import java.lang.Math;
interface Perimeter
{
    double r;
    void show();
}
interface Area
{
    void get();
}
class Circle implements Perimeter,Area
{
    public void show()
    {
        double per;
        per=2*r;
        System.out.println("Perimeter of circle = "+per);
    }
    public void get()
    {
        double area;
        area=Math.PI*r*r;
        System.out.println("Area of circle = "+area);
    }

    public static void main(String[] args)
    {
        Circle cr=new Circle();
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter the radius of circle :-");
        cr.r=sc.nextDouble();

        cr.show();
        cr.get();
    }
}


OUTPUT :-
    
    
    PS F:\Java> javac Circle.java
    PS F:\Java> java Circle
    Enter the radius of circle :-
     7
     Perimeter of circle = 14.0
     Area of circle = 153.93804002589985
        
        
        
