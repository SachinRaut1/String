package StringsbyDeepak;

public class String_Comparison {

	public static void main(String[] args) {
		
		
		String s1="sachin";
		String s4="sachin";
		String s2="amit";
		String s3="Amit";
		String s5="";
		
		//equals() it is used to compare two String and content
		System.out.println(s1.equals(s4));//true
		System.out.println(s1.equals(s3));//false
		System.out.println(s2.equals(s3));//false
		
		//equalsignorecase() it is used to ignore upper case and lower case
		System.out.println(s2.equalsIgnoreCase(s3));//true
		
		System.out.println(s5.equals(""));
		
		
		
		//Comparison method
		//compareTo() retuns in integer value means ascci code
		String s6="abc";
		String s7="ABC";
		System.out.println(s6.compareTo(s7));
		
		System.out.println(s6.compareToIgnoreCase(s7));

	}

}
