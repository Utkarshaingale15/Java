import java.util.Scanner;
class Swapno{
	public static void main(String args[]){
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :- ");
		a=sc.nextInt();
		System.out.println("Enter the number :- ");
		b=sc.nextInt();
		System.out.println("Before Swapping :- ");
		System.out.print("a = "+a);
		System.out.println("    b = "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping :- ");
		System.out.print("a = "+a);
		System.out.println("    b = "+b);
		}
	}


OUTPUT :-
	
	
	PS F:\Java> javac Swapno.java
PS F:\Java> java Swapno
Enter the number :- 
2
Enter the number :- 
3
Before Swapping :- 
a = 2    b = 3
After Swapping :-
a = 3    b = 2
	
	
	
