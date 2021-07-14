
public class Overriden1 extends MethodOverriding1 {
//	 

	public  void disp() {
		System.out.println("child class");
		//super.disp();//by super keyword we can call object of immediate parent class
	
	}

	public static void main(String[] args) {
		//Overriden1 obj = new Overriden1();
		//obj.disp();
		//parent class reference refer to child class object then it override the method of child class
		MethodOverriding1 obj1= new Overriden1();
		obj1.disp();
		
	}
}
