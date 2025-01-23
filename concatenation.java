package StringsbyDeepak;

public class concatenation {

	public static void main(String[] args) {
		
		
		
		String s1="sachin";
		String s2="raut";
		
		//concatination using "...+..." operator
		System.out.println(".........................+..Operator..........................");
		
		System.out.println(s1+s2);//sachinraut
		System.out.println(s1+10);//sachin10
		System.out.println(s1+10+20);//sachin1020
		System.out.println(10+s1+20);//10sachin20 
		System.out.println(10+20+s1);//30sachin
		System.out.println(s1+20/10);//sachin2
		System.out.println(s1+10*20);//sachin200
		//System.out.println(s1+20-10);//error
		
		System.out.println("..................concat()method............................");
		//concat() method concatinates one String to the end of another String.
		//this method returns a string with the value of String passed into the method.
		//appended to  the end of the String.
		
		
		//concatination using concat() method.
		
		System.out.println(s1.concat(s2));
		
		System.out.println("............................join()method..........................");
		//join() is a static method which concatinate the given element with the delimiter
		//and return the concatinated String..
		//it was included in jdk 1.8 version
		
		System.out.println(String.join("::",s1,s2));//"::" it is delimiter example.
		//System.out.println(String.join(null, s1,s2));//nullpointerexception
	}

}
