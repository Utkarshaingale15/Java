import java.util.Scanner;
	class Cube{
		public static void main(String args[]){
			int a,per,tsa,csa,vol;
			Scanner sc=new Scanner(System.in);
			
            System.out.println("Enter the length of Cube :-");
            a=sc.nextInt();

            per=6*a;
		    System.out.println("Perimeter of Cube = "+per);

		    tsa=6*(a*a);
		    System.out.println("Total surface area of Cube = "+tsa);

			csa=4*(a*a);
			System.out.println("Curved surface area of Cube = "+csa);

			vol=a*a*a;
			System.out.println("Volume of Cube = "+vol);
			}
	}