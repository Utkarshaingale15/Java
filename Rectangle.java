//calculating the perimeter and area of rectangle using this keyword

import java.util.Scanner;
class Calculate
{
int l,b;

void Perimeter()
{
    int per;
    per=2*(this.l+this.b);
    System.out.println("Perimeter of rectangle = "+per);
}
void Area()
{
    int area;
    area=this.l*this.b;
    System.out.println("Area of rectangle = "+area);
}
}
class Rectangle
{
    public static void main(String args[])
    {
        Calculate c1=new Calculate();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length of rectangle :-");
        c1.l=sc.nextInt();
        System.out.println("Enter the breadth of rectangle :-");
        c1.b=sc.nextInt();  

       c1.Perimeter();
       c1.Area();

    }
}