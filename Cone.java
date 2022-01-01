import java.util.Scanner;
import java.lang.Math;
	class Cone{
		public static void main(String args[]){
			double r,h,l,per,tsa,csa,vol;
			Scanner sc=new Scanner(System.in);

            System.out.println("Enter the radius of Cone :-");
            r=sc.nextDouble();

            System.out.println("Enter the height of Cone :-");
            h=sc.nextDouble();

            System.out.println("Enter the slant height of Cone :-");
            l=sc.nextDouble();

		    tsa=Math.PI*r*(r+l);
		    System.out.println("Total surface area of Cone = "+tsa);

			csa=Math.PI*r*l;
			System.out.println("Curved surface area of Cone = "+csa);

			vol=(Math.PI*r*r*h)/3;
			System.out.println("Volume of Cone = "+vol);
			}
	}


OUTPUT :-
	
	
PS F:\Java> javac Cone.java
PS F:\Java> java Cone
Enter the radius of Cone :-
8
Enter the height of Cone :-
5
Enter the slant height of Cone :-
Curved surface area of Cone = 226.1946710584651
Volume of Cone = 335.1032163829113
	
	
	
