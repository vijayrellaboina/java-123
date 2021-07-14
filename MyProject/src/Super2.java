
public class Super2 extends Super1 {
int a=22;
	public Super2() {
		super();
		//super()//automatically compiler call constructor
	System.out.println(" Super2 Constructor");
	}
	public void method2() {
		System.out.println("Method of super2");
		System.out.println(a);
		System.out.println(super.a);
	//by using super key we call variable of super1 class
		super.name();
		//we can call method also
	}
	public static void main(String[] args) {
		Super2 obj = new Super2();
		obj.method2();

	}

}
