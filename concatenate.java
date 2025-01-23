package StringsbyDeepak;

public class concatenate {

	public static void main(String[] args) {
		
		
		String s="this is sachin raut";
		
		//subSequence() method return charSequnce.
		//-1 means bacause beginIndex start with 0 and endIndex start with -1
		System.out.println(s.subSequence(2, 9));//-1
		
		
		//
		//here only substring start with 5 and end with last character
		System.out.println(s.substring(5));
		
		//-1 means bacause beginIndex start with 0 and endIndex start with -1
		System.out.println(s.substring(3, 12));//-1

	}

}
