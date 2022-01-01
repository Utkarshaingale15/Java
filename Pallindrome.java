import java.util.Scanner;
class Pallindrome{
	public static void main(String args[]){
		int n,r=0,sum=0,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :-");
		n=sc.nextInt();
		t=n;

		while(n>0){
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
		if(t==sum)
				System.out.println("Pallindrome number");
				else{
				System.out.println("Not a Pallindrome number");
			}
		}
	}

OUTPUT :-
	
	PS F:\Java> javac Pallindrome.java
PS F:\Java> java Pallindrome
Enter the number :-
12321
Pallindrome number
PS F:\Java> java Pallindrome
Enter the number :-
789
Not a Pallindrome number

