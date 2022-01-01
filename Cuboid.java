import java.util.Scanner;
	class Cuboid{
		public static void main(String args[]){
			int l,b,h,per,tsa,csa,vol;
			Scanner sc=new Scanner(System.in);
			
            System.out.println("Enter the length of Cuboid :-");
            l=sc.nextInt();

            System.out.println("Enter the breadth of Cuboid :-");
            b=sc.nextInt();

            System.out.println("Enter the height of Cuboid :-");
            h=sc.nextInt();

            per=4*(l+b+h);
		    System.out.println("Perimeter of Cuboid = "+per);

		    tsa=2*((l*b)+(b*h)+(h*l));
		    System.out.println("Total surface area of Cuboid = "+tsa);

			csa=2*h*(l+b);
			System.out.println("Curved surface area of Cuboid = "+csa);

			vol=l*b*h;
			System.out.println("Volume of Cuboid = "+vol);
			}
	}