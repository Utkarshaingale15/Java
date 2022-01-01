import java.util.Scanner;
class Permutation{

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
			int n,r,per;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the value of n :-");
			n=s.nextInt();

			System.out.println("Enter the value of r :-");
			r=s.nextInt();

			per=(fact(n))/(fact(n-r));
			System.out.println("Permutation is :- "+per);

		}
	}


OUTPUT :-
	
	
	PS F:\Java> javac Permutation.java
PS F:\Java> java Permutation
Enter the value of n :-
5
Enter the value of r :-
7
Permutation is :- 120
	
	
