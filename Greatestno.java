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


OUTPUT :-
	
	PS F:\Java> javac Greatestno.java
PS F:\Java> java Greatestno
Enter the value of a :-
23
Enter the value of b :-
45
Enter the value of c :-
67
c have greatest value
PS F:\Java> java Greatestno
Enter the value of a :-
9
Enter the value of b :-
78
Enter the value of c :-
34
b have greatest value
PS F:\Java> java Greatestno
Enter the value of a :- 
90
Enter the value of b :- 
54
Enter the value of c :- 
34
a have greatest value

