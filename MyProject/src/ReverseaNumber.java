//import java.util.Scanner;

public class ReverseaNumber {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int num = sc.nextInt();//it accept the value from the user and stored in int
		
		int rev=0;
		1.using algorithm
		while(num!=0) {    //rev*10=0*10=0
			rev=rev*10 +num%10; //0+1234%10=4  40+3=43 430+2=432 432+1=4321
			num=num/10; //1234/10=123 123/10=12 12/10=1 1/10=0;
		}*/
		
		//Logic 2 StringBuffer
		
		/*int num=1234;
		StringBuffer sb= new StringBuffer(String.valueOf(num)) ;
		//string.value convert our number and store in sb variable
sb.reverse();
	 System.out.println("Reverse number:"+sb); */
	 
		
		//Logic StringBuilder
		int num=1234;
		StringBuilder sb1= new StringBuilder();
		sb1.append(num);
		sb1.reverse();

		
		
	System.out.println("Reverse number:"+sb1);
	}

}

