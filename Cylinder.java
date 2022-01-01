import java.util.Scanner;
import java.lang.Math;
	class Cylinder{
		public static void main(String args[]){
			double r,h,tsa,csa,vol;
			Scanner sc=new Scanner(System.in);

            System.out.println("Enter the radius of Cylinder :-");
            r=sc.nextDouble();

            System.out.println("Enter the height of Cylinder :-");
            h=sc.nextDouble();

		    tsa=2*Math.PI*r*(r+h);
		    System.out.println("Total surface area of Cylinder = "+tsa);

			csa=2*Math.PI*r*h;
			System.out.println("Curved surface area of Cylinder = "+csa);

			vol=Math.PI*r*r*h;
			System.out.println("Volume of Cylinder = "+vol);
			}
	}


OUTPUT :-
	
PS F:\Java> javac Cylinder.java   
PS F:\Java> java Cylinder
Enter the radius of Cylinder :-
8
Enter the height of Cylinder :-
12
Total surface area of Cylinder = 1005.3096491487338
Curved surface area of Cylinder = 603.1857894892403
Volume of Cylinder = 2412.743157956961
	
	
	
