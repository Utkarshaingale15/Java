//calculating Perimeter and Area of Ellipse using super keyword

import java.util.Scanner;
import java.lang.Math;

class Perimeter
{
    double a,b;
    void Calculate()
    {
        double per;
        per=((2*Math.PI)*(Math.sqrt((a*a)+(b*b))))/2;
        System.out.println("Perimeter of Ellipse = "+per);
    }
}
class Area extends Perimeter
{
    void Calculate()
    {
        double area;
        area=Math.PI*a*b;
        System.out.println("Area of Ellipse = "+area);

    }
    void show()
    {
        Calculate();
        super.Calculate();
    }
}

class Ellipse
{
    public static void main(String[] args)
     {
       Area a1=new Area();
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter the major axis of Ellipse :-");
        a1.a=sc.nextDouble();

        System.out.println("Enter the minor axis of Ellipse :-");
        a1.b=sc.nextDouble();

        a1.show();

    }
}