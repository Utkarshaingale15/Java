
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