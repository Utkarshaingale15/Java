import java.util.Scanner;
class Leapyear{
	public static void main(String args[]){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year :- ");
		n=sc.nextInt();

		if(n%4==0)
		System.out.println(+n+ " is a leap year");
		else{
			System.out.println(+n+ " is not a leap year");
			}

		}
	}


OUTPUT :-
	
	
	PS F:\Java> javac Leapyear.java
PS F:\Java> java Leapyear
Enter the year :-
2004
2004 is a leap year
PS F:\Java> java Leapyear
Enter the year :-
1997
1997 is not a leap year

