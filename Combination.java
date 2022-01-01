import java.util.Scanner;
class Combination{

		public static int fact(int no)
		{
			int i,fact=1;
			for (i=1;i<=no;i++)
			{
				fact=fact*i;
				}
				return fact;
			}
			public static void main(String args[]){
			int n,r,com;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the value of n :-");
			n=s.nextInt();

			System.out.println("Enter the value of r :-");
			r=s.nextInt();

			com=(fact(n))/(((fact(r))*(fact(n-r))));
			System.out.println("Combination is :- "+com);
		}
	}