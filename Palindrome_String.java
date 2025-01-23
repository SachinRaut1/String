package String_Programs;

public class Palindrome_String {

	public static void main(String[] args) {


		String rev="";
		String s="NITIN";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		
		if(s.equals(rev))
		{
			System.out.println("it is palindrome String");
		}
		else
		{
			System.out.println("not a palindrome String");
		}
	}

}
