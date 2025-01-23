package StringsbyDeepak;

import java.util.jar.Attributes.Name;

public class String_caseConvension {

	public static void main(String[] args) {
		
		String name="sachin";
		//case conversion method
		System.out.println(name.toUpperCase());//SACHIN
		
		String s1="RAUT";
		System.out.println(s1.toLowerCase());//raut
		
		//type conversion method
		int a=10,b=20;
		//valueOf()  is a static method
		System.out.println(a+b);//30
		String s2=String.valueOf(a);
		System.out.println(s2.valueOf(a));
		String s3=String.valueOf(b);
		System.out.println(s3.valueOf(b));
		
		System.out.println(s2+s3);//1020 concatinaton
		
		char[]c=name.toCharArray();
		System.out.println(c);
		

	}

}
