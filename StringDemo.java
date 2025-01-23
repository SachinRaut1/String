package StringsbyDeepak;

public class StringDemo {

	public static void main(String[] args) {
		
		String s=new String("gopal"); //1obj create in heap and literal created in SCP
		System.out.println(s);
		String s1="sachin";   //1 obj created
		System.out.println(s1);

		
		String s2=new String("sachin");
		System.out.println(s2);
		System.out.println(s2.isEmpty());
		
	}

}
