package interfaceTopic;


interface message{
	void print();

default void thirdPrint() {
	System.out.println("third");
}
}
interface secondPrint{
	void print2();


}
public class InterfaceDemo implements message, secondPrint{
public void print() {
	System.out.println("I am a interface method");
}
public void print2() {
	System.out.println("I am a interface method2");
}
	public static void main(String[] args) {
		InterfaceDemo m = new InterfaceDemo();
		m.print();
		m.print2();
		m.thirdPrint();
//message m1= new InterfaceDemo();
//m1.print();
//secondPrint m2=new InterfaceDemo();
//m2.print2();
	}

}
