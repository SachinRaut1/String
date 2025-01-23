package String__Buffer;

public class string_Buffer1 {

	public static void main(String[] args) {


		StringBuffer sb=new StringBuffer("sachin");
		System.out.println(sb.capacity()); //16+sachin=22 //
		
		System.out.println(sb.length());//current character lengh present
		
		System.out.println(sb.append(" hhhhhhhhhhhhhraut")); //append raut character in last of the sachin String
		System.out.println(sb.capacity());//22+1*2=46
		System.out.println(sb.charAt(4)); //return char which is present in 4th index
		
		//start with 0 end with -1
		//begining index start with 0 
		//ending index start with -1
		System.out.println("delete:=> "+sb.delete(2, 5)); 
		
		System.out.println("deleteCharAt:=> "+sb.deleteCharAt(3));
		//................................................//
		
		
		StringBuffer sb1=new StringBuffer("sachinRaut");
		//String buffer class doen not override the equals() method
		//but String class override equals() method
		System.out.println("equals:=> "+sb.equals(sb1));
		//..................................................................//
		
		
		System.out.println("indexOf:=> "+sb1.indexOf("a"));//int 
		System.out.println("lastIndexOf:=> "+sb1.lastIndexOf("t"));
		
		System.out.println(sb1.insert(10, "gopal"));
		
		System.out.println(sb1.replace(3, 6, "sunil"));
	//	System.out.println(sb1.reverse());
		System.out.println(sb1.subSequence(1, 6));//return charsequence
		System.out.println("substring 5:=> "+sb1.substring(5));
		System.out.println("substring 5-11:=> "+sb1.substring(5, 11));
		
		//toString() convert StringBuffer into String
		System.out.println("toString=> "+sb1.toString());
		System.out.println(sb1.capacity());
		sb1.ensureCapacity(200);
		System.out.println("ensureCapacity=> "+sb1.capacity());
		
		sb1.setCharAt(4, 'M');
		sb1.setLength(5);
		System.out.println(sb1);
		
		System.out.println(".............................................................");
		StringBuffer sb2=new StringBuffer();
		sb2.ensureCapacity(100);
		sb2.append("sachin");
		sb2.trimToSize();
		System.out.println(sb2.capacity());
		

	}

}
