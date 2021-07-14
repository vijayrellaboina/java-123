
public class StaticKeyword {
	static int a;
	static int b=StaticKeyword();
	static {
		a = 100;
		System.out.println("a is initialized:" + a);
	}
	static int StaticKeyword() {
		System.out.println("static method");
		return 20;
	}
//public StaticKeyword() {
//	System.out.println("constructor");
//}
	public static void main(String[] args) {
System.out.println(b);
	StaticKeyword ovbj =new StaticKeyword();
	}

}
