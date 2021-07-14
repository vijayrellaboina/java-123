
public class SumofDigitsInANumber {

	public static void main(String[] args) {
		
		int num=2345;
		int sum=0;
		while(num>1) 
		{
			sum=sum+num%10;//5+4+3+2
			num=num/10; //234 23 2 
		}
System.out.println("Sum of digits in anumber:"+sum);
	}

}
