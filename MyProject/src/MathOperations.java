
public class MathOperations {

	 int Number1;
	
	 int Number2;
	public MathOperations(int Number1,int Number2) {
		this.Number1=Number1;
		//this.Number1=Number2;
		this.Number2=Number2;
	}
	public void Sum() 
	{
		int sum=Number1+Number2;
		System.out.println("Sum :"+sum);
	}
	
	public static void main(String[] args) {
	MathOperations bj=new MathOperations(54,30);
bj.Sum();
DataHiding dat= new DataHiding();
dat.set(20);
System.out.println(dat.get());
	}

}
