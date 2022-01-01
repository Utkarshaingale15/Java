//calculating the area and perimeter of square using inheritance concept

import java.util.Scanner;
class Perimeter
{
    int a;
    void show()
    {
    int per;
    per=4*a;
    System.out.println("Perimeter of square = "+per);
    }
}
class Area extends Perimeter
{
    void execute()
    {
    int area;
    area=a*a;
    System.out.println("Area of square = "+area);
    }
}
class Square extends Area
{
    public static void main(String[] args)
     {
        Area a1=new Area();
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter the side of square :-");
        a1.a=sc.nextInt();

        a1.show();
        a1.execute();
    }
}