import java.util.Scanner;
class Npower{
	public static void main(String args[]){
		int n,power,p;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number :-");
		n=s.nextInt();
		System.out.println("Enter the power of number :-");
		p=s.nextInt();
		power=p;
		long res=1;
		while(p!=0)
		{
		res=res*n;
		p--;
	}
		System.out.println(n+ " power of " +power+ " is :- "+res);
		}
	}

OUTPUT :-
	
	
	PS F:\Java> javac Npower.java
PS F:\Java> java Npower
Enter the number :-
7
Enter the power of number :-
5
7 power of 5 is :- 16807
	
	
	
