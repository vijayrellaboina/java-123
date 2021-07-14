import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) 
	{
		

		// Logic 2
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int num = sc.nextInt();// it accept the value from the user and stored in int
		int org_num = num;
		int rev = 0;
		// 1.using algorithm
		while (num != 0) 
		{ // rev*10=0*10=0
			rev = rev * 10 + num % 10; // 0+1234%10=4 40+3=43 430+2=432 432+1=4321
			num = num / 10; // 1234/10=123 123/10=12 12/10=1 1/10=0;
		}
if(org_num==rev) {
	System.out.println(" palidrome number:"+ rev);
}
else 
	System.out.println("not a polidrome number:"+ rev);

		
}	
				 
				
				 
			
				 	 
	}

