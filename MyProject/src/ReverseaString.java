
public class ReverseaString {

	public static void main(String[] args) {

		//Logic1
		String str="ABCD";
		
		StringBuffer abc=new StringBuffer(str);
		System.out.println(abc.reverse());
		
		//Logic2 using (string + cocatenation operation)
//		String str="ABCD";
//		String abc="";
//		int len=str.length();
//		
//		for(int i=len-1;i>=0;i--) {
//			abc=abc+str.charAt(i);
//			
//			}
		//System.out.println(abc);
	}

}
