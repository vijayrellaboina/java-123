package abstraction;

public class MainClass {

	public static void main(String[] args) {
		NormalClass ref1= new NormalClass(10, 20);
		System.out.println(ref1.print());
		System.out.println(ref1.sum());
		
		System.out.println();
		
		NormalClass2 ref2= new NormalClass2(20, 30);
		System.out.println(ref2.sum());
System.out.println(ref2.print());
	}

}
