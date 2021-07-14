
public class SuperSubClass extends SuperKey1{

	int num=110;
	public void printNumber() {
		System.out.println(super.num);// by super key we call parent class number
	}
	public static void main(String[] args) {
		SuperSubClass obj=new SuperSubClass();
		obj.printNumber();


		
	}

}
