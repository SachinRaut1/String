package StringsbyDeepak;

public class String_Replace_method {

	public static void main(String[] args) {
		
		String s1="hello this is hello sachin";
		
		System.out.println(s1.replace("hello", "hii"));
		System.out.println(s1.replaceFirst("is", "at"));
		System.out.println(s1.replaceAll("is", "there"));
		System.out.println(s1.replaceAll("is(.)", "was"));
		System.out.println(s1.replaceAll("is(.*)", "raut"));
		

	}

}
