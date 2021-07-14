
public class NumberofEvenandOddDigits {

	public static void main(String[] args) {
		int num=23456789;
		int even_count=0;
		int odd_count=0;
		
		while(num>1) //23456789 
		{
			int rem=num%10;  //9 8 7 6 5 4 3 2
	//last num/2		
			if(rem%2==0) 
			{
				even_count++;// 8 6 4 2
			}
			else {
				odd_count++; //9 7 5 3
			}
		num=num/10; // 23456789/10=2345678 it element the last number
		}
System.out.println("Number of even count:"+ even_count);
System.out.println("Number of odd count:"+ odd_count);
	}

}
