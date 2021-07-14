import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumberorString {

	public static void main(String[] args) {
		//approach 1
//Random rand=new Random();
//int rand_rt=rand.nextInt(100);
//System.out.println(rand_rt);
 //double rand_dou= rand.nextDouble();
 //System.out.println(rand_dou);
		//math approach
		//System.out.println(Math.random());
		
		String rand= RandomStringUtils.randomNumeric(5);
		System.out.println(rand);
		
		String rand_str= RandomStringUtils.randomAlphabetic(4);
		System.out.println(rand_str);
 
	}

}
