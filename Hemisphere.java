import java.util.Scanner;
import java.lang.Math;
	class Hemisphere{
		public static void main(String args[]){
			double r,tsa,csa,vol;
			Scanner sc=new Scanner(System.in);

            System.out.println("Enter the radius of Hemisphere :-");
            r=sc.nextDouble();

		    tsa=3*Math.PI*r*r;
		    System.out.println("Total surface area of Hemisphere = "+tsa);

			csa=2*Math.PI*r*r;
			System.out.println("Curved surface area of Hemisphere = "+csa);

			vol=(2*Math.PI*r*r*r)/3;
			System.out.println("Volume of Hemisphere = "+vol);
			}
	}