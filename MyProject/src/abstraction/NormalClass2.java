package abstraction;

public class NormalClass2 extends AbstractionClass{

	public NormalClass2(int num1, int num2) {
		super(num1, num2);
		System.out.println("constructor-----> Normal class");
	}


	@Override
	int sum() {
		int  sum=(num1*10)+(num2*20);
		return sum;
	}

	@Override
	 String print() {
		// TODO Auto-generated method stub
		return "sum is"+ sum();
	}

}
