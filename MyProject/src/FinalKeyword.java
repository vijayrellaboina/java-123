
public class FinalKeyword {
final  int a;
//using final the 'a' value is restricted 
public FinalKeyword() {
	a=20;
	System.out.println(a);
}
final static int b;
static {
	b=21;
	System.out.println(b);
}
void method() {

	System.out.println("vijay");
}
	public static void main(String[] args) {
		
FinalKeyword obj =new FinalKeyword();
obj.method();
	
	}

}
