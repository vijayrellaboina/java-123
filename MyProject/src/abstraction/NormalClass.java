package abstraction;

public class NormalClass extends AbstractionClass{

	public NormalClass(int num1, int num2) {
		super(num1, num2);
		System.out.println(" Constrctor-----> normal class");
	}


	

	@Override
	int sum() { 
	int sum=num1+num2;
		return sum;
	}

	@Override
	 String print() {
		
		return "sum is"+ sum();
	}

}
