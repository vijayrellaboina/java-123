
public class Swapping {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before swapping values.."+a+"  "+b);
		
		//Logic1
	/*	int t=a;// third variable
		a=b;
		b=t;*/
		
		/*//Logic2
		//use + & - 
		a=a+b
		//Logic3
		
		/*a=a+b-(b=a);*/
		
		//Logic4
		// using * & /
		
		/*a=a*b;
		b=a/b;
		a=a/b;*/
		
		//LOGIC5
		//BITWISE xor(^)
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		
		
		
		
		
		
		
		
		System.out.println("After swapping values.. "+a+"  "+b);
	}

}
