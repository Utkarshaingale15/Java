
	import java.util.Scanner;

	class Ascii
	{
		public static void main(String args[])
		{
			Scanner scan=new Scanner(System.in);

			System.out.println("Enter th char value :- ");

			char ch=scan.next().charAt(0);

			int ascii=(int) ch;
			
			System.out.println("The Ascii value of "+ch+ " is = "+ascii);

		}
	}


OUTPUT :-
	
	
PS F:\Java> javac Ascii.java
PS F:\Java> java Ascii
Enter th char value :-
,
The Ascii value of , is = 44
PS F:\Java> java Ascii
Enter th char value :-
J
The Ascii value of J is = 74
PS F:\Java> java Ascii
Enter th char value :-
The Ascii value of m is = 109
PS F:\Java> java Ascii
Enter th char value :-
}
The Ascii value of } is = 125
	
	
	
