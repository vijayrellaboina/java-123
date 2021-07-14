package abstraction;

public abstract class AbstractionClass {

	int num1;
	int num2;
 public AbstractionClass(int num1, int num2) {
	System.out.println(" constructor------->Abstract class");
	this.num1=num1;
	this.num2=num2;
}
	//abstraction method
 abstract int sum();
  abstract String print();
 
 // concrete method
 public String printNumbers() {
	 return "numbers used:"+num1+","+num2;
 }
	public static void main(String[] args) {
		

	}

}
