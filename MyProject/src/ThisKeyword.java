
public class ThisKeyword {
	int a;
	int b;

	public ThisKeyword(int a,int b) {
		this.a=a;
		this.b=b;
		}
	public void print() {
		System.out.println(a);
	}
	public ThisKeyword() {
		this(36,40);
	}
	
	public void  method() {
	System.out.println("method1");
	this.print();
	}
	public static void main(String[] args) {
		ThisKeyword obj =new ThisKeyword(30, 40);
		obj.print();
	obj.method();
	}

}
