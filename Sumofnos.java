import java.util.Scanner;
		class Sumofnos{
			public static void main(String args[]){
				int i,n,sum=0;
				Scanner sc=new Scanner(System.in);
				System.out.println("Sum from :-");
				i=sc.nextInt();

				System.out.println("Sum upto :-");
				n=sc.nextInt();

				while(i<=n)
				{
					sum=sum+i;
					i++;
					}
					System.out.println("Sum of numbers :- "+sum);
				}
		}