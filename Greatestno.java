import java.util.Scanner;
	class Greatestno{
		public static void main(String args[]){
			int a,b,c;
			Scanner s=new Scanner(System.in);

			System.out.println("Enter the value of a :- ");
			a=s.nextInt();

			System.out.println("Enter the value of b :- ");
			b=s.nextInt();

			System.out.println("Enter the value of c :- ");
			c=s.nextInt();

			if(a>b && a>c)
			System.out.println("a have greatest value");
			else if(b>c && b>a)
			System.out.println("b have greatest value");
			else
			System.out.println("c have greatest value");
			}
	}

