//calculating area and perimeter of parallelogram using function overloading

import java.util.Scanner;
class Calculate
{
    int a,b;
    double h;
    void show(int a,int b)
    {
        int per=2*(a+b);
        System.out.println("Perimeter of Parallelogram = "+per);
    }
    void show(int a,double h)
    {
        double area=a*h;
        System.out.println("Area of Parallelogram = "+area);
    }
}
class Parallelogram
{
    public static void main(String args[])
     {

        Calculate cal=new Calculate();
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter the base of Parallelogram :-");
        cal.a=sc.nextInt();

        System.out.println("Enter the side of Parallelogram :-");
        cal.b=sc.nextInt();

        System.out.println("Enter the height of Parallelogram :-");
        cal.h=sc.nextDouble();

        cal.show(cal.a,cal.b);
        cal.show(cal.a,cal.h);
 
    }
}
