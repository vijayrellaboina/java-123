
public class Polymorphism {
//overloading
	public static void createContact(String name, int num1) {
		System.out.println("The name is:"+name);
		System.out.println("The number1 is:"+num1);
		System.out.println("  ");
	}
	public static void createContact(String name, int num1, int num2) {
		System.out.println("The name is:"+name);
		System.out.println("The number1 is:"+num1);
		System.out.println("The number2 is:"+num2);
	}
	public static void createContact(String name, double num1) {
		System.out.println("The name is:"+name);
		System.out.println("The number1 is:"+num1);
	}
	public static void main(String[] args) {
		createContact("vijay", 741.92);
		//createContact("vijay", 741, 143);

	}

}
