package StringsbyDeepak;

public class String_searching_methods {

	public static void main(String[] args) {
		
		String s="hello this is sachin";
		
		//get value in char or String and return in int
		System.out.println(s.indexOf('o'));
		
		//get in String and return in integer.
		System.out.println(s.lastIndexOf("in"));
		
		//get value in integer and return in char.
		System.out.println(s.charAt(6));
		
		//it check this String is present or not in the given String and return in boolean.
		System.out.println(s.contains("sa"));//true
		
		//Tests if this string starts with the specified prefix
		//true if the character sequence represented by the argument is a prefix 
		//of the character sequence represented by this string;false otherwise.
		//Note also that true will be returned if theargument is an empty string or is equal 
		//to this String object as determined by the equals(Object) method.
		
		System.out.println(s.startsWith("h"));//true
		System.out.println("empty string:"+s.startsWith(""));//true
		
		//Tests if this string ends with the specified suffix.
		System.out.println(s.endsWith("i"));//false

	}

}
