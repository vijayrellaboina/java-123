
public class CountNumberOfDigits {

	public static void main(String[] args) {
		int num =123456;
		int count=0;
		 while(num>0) {
			 num=num/10; //123456/10=1
		 	 count++;
		 }
System.out.println("Number of Digits:"+count);
	}

}
