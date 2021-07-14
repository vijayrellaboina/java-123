package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionClass {

	
	public static void compileTime() throws FileNotFoundException  {
		File f = new File("");
		FileReader fr=new FileReader(f);
		throw new FileNotFoundException();
	}
	
	public static void runTime() {
		String a= "tarun";
		System.out.println(a.length());
		//throw new FileNotFoundException();
	}
	public static void main(String[] args) throws FileNotFoundException {
		try {	
			compileTime();
		}
		catch(FileNotFoundException e){
			
		}
		catch(Exception e1) {
			
		}
		finally {
			System.out.println("Exception handle");
		}
	}

}
