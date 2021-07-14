
public class Constructor {
	int a;
	String b;
	public Constructor(int a, String b) {
	//Special method which is used to initialize the object	i.e. allocating memory to the object
	//Constructor is invoked when class is instantiated
		this.a=a;
	this.b=b;
	System.out.println(a+","+b);
		
	}
	
	public Constructor(String b1, int a) {
		this.a=a;
		this.b=b1;
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
Constructor ref=new Constructor(10, "ABC");
Constructor ref2=new Constructor( "CV", 10);
System.out.println(ref.a+","+ref.b);
System.out.println(ref2.a+","+ref2.b);
}
}