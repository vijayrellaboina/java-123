import java.util.Scanner;

public class PalindromeString {

	 public static void main(String[] args) {
		
		 Scanner sr= new Scanner(System.in);
		 System.out.println("Enter a String");
	String str=sr.next();
	String rev="";
	String org_str=str;
	int len=str.length();
	
	for(int i=len-1;i>=0;i--) {
		rev=rev+str.charAt(i);
	}
		// System.out.println(rev);
	if(org_str.equals(rev)) {
		System.out.println(org_str+" is a palidrome");
	}
	else {
		System.out.println(org_str+ "is not apalidrome ");
	}
	 }
	
	
		
	
}
