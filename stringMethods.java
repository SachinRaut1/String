package StringsbyDeepak;

public class stringMethods {
	
	public static void main(String[] args) {
		
		String name ="sachin";
		String pass="  raut";
		String name1=" gopal ";
		String pass1=" ";
		String abc=" ";
		
		//length() count the no. of character and return in integer
		System.out.println("sachin:->"+name.length());
		
		//trim() this methods remove the spaces before and after the String
		System.out.println("raut:->"+pass.trim());
		
		
		//remove the spaces before and aftter the String and
		//count the no. of character and return in integer
		System.out.println("gopal:->"+name1.trim().length());
		
		//remove the spaces and this stringis empty
		System.out.println("empty:->"+ pass1.trim());//return o/p is empty
		
		System.out.println("boolean:->"+abc.isEmpty());
	}

}
