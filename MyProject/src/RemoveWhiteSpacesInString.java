
public class RemoveWhiteSpacesInString {

	public static void main(String[] args) {
		String str="Java   programming jdk jvm";
		System.out.println("Before reoving spaces:"+str);
str=str.replaceAll("\\s", "");
System.out.println("after removing the spsces:"+str);
	}

}
