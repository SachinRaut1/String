package String_Programs;

public class Reverse_String {

	public static void main(String[] args) {
		String rev = "";
		String s="sachin";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
			//System.out.println(rev);
			
		}
		System.out.println(rev);
	}

}
