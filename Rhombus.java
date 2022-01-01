//calculating perimeter and area of rhombus using method overriding

import java.util.Scanner;
class Perimeter
{
    float a;
    void show(float a)
    {
        float per;
        per=4*a;
        System.out.println("Perimeter of Rhombus = "+per);
    }
}
class Area extends Perimeter
{
    float d1,d2;
    void show(float d1,float d2)
    {
        float area;
        area=(d1*d2)/2;
        System.out.println("Area of Rhombus = "+area);

    }
}
class Rhombus extends Area
{
    public static void main(String args[]) 
    {
        Area a1=new Area();
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter the side of Rhombus :-");
        a1.a=sc.nextFloat();

        System.out.println("Enter the first diagonal of Rhombus :-");
        a1.d1=sc.nextFloat();

        System.out.println("Enter the second diagonal of Rhombus :-");
        a1.d2=sc.nextFloat();

        a1.show(a1.a);
        a1.show(a1.d1,a1.d2);
        
    }
}


OUTPUT :-
    
    PS F:\Java> javac Rhombus.java
PS F:\Java> java Rhombus
Enter the side of Rhombus :-
6
Enter the first diagonal of Rhombus :-
7
Enter the second diagonal of Rhombus :-
8
Perimeter of Rhombus = 24.0
Area of Rhombus = 28.0
    
    
    
