import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);//this will take a argument from the user
		
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		
		System.out.println("Enter the number:");
		int b=sc.nextInt();
		
		System.out.println("Enter the number:");
		int c=sc.nextInt();
		
		 //Approach 1
		/*if(a>b && a>c) {
			System.out.println(a+"is largest number");
		}
		else if(b>a && b>c) {
			System.out.println(b+"is largest number");
		}
		else 
		{
			System.out.println(c+"is largest number");
		}*/
	int largest1=a>b?a:b; // largest of a and b
	int largest2=c>largest1?c:largest1;
	System.out.println(largest2+"is largest number");
	
	}

}
