import java.util.Scanner;
class Primeno{
	public static void main(String args[]){
		int n,i,c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		n=s.nextInt();
		for(i=2;i<n;i++)

		if(n%i==0){
			c++;
			break;
			}

			if(c==0){
		System.out.println(+n+ " is a prime number");
	}
		else{
		System.out.println(+n+ " is a not prime number");
			}
		}
	}


OUTPUT :-
	
	
	PS F:\Java> javac Primeno.java
PS F:\Java> java Primeno
Enter the number
78
78 is a not prime number
PS F:\Java> java Primeno
Enter the number
19
19 is a prime number


