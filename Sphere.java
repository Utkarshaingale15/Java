import java.util.Scanner;
import java.lang.Math;
	class Sphere{
		public static void main(String args[]){
			double r,tsa,csa,vol;
			Scanner sc=new Scanner(System.in);

            System.out.println("Enter the radius of Sphere :-");
            r=sc.nextDouble();

		    tsa=4*Math.PI*r*r;
		    System.out.println("Total surface area of Sphere = "+tsa);

			csa=4*Math.PI*r*r;
			System.out.println("Curved surface area of Sphere = "+csa);

			vol=(4*Math.PI*r*r*r)/3;
			System.out.println("Volume of Sphere = "+vol);
			}
	}


OUTPUT :-
	
	
	PS F:\Java> javac Sphere.java
PS F:\Java> java Sphere
Enter the radius of Sphere :-
7
Total surface area of Sphere = 615.7521601035994
Curved surface area of Sphere = 615.7521601035994
Volume of Sphere = 1436.7550402417319
	
	
	
