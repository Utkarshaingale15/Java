import java.util.Scanner;
class Armstrong{
	public static void main(String args[]){
		int n,c,rem,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number :-");
		n=s.nextInt();
		c=n;
		while(c!=0)
		{
			rem=c%10;
			sum=sum+(rem*rem*rem);
			c=c/10;
			}
			if(sum==n)
			System.out.println(+n+ " is a Armstrong number");
			else{
				System.out.println(+n+ " is not a Armstrong number");
				}
		}
	}


OUTPUT :- 
	

PS F:\Java> javac Armstrong.java
PS F:\Java> java Armstrong
Enter the number :-
153
153 is a Armstrong number
PS F:\Java> java Armstrong
Enter the number :-
675
675 is not a Armstrong number


