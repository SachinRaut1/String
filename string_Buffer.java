package String__Buffer;

public class string_Buffer {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		System.out.println("oldCapacity:"+sb.capacity());
		sb.append("sachinGopalSunil");   //we can store 16 character in this constructor is 16
		System.out.println(sb.capacity()); //old capacity 16
		
		System.out.println(".............................................................");
		
		StringBuffer sb1=new StringBuffer();
		System.out.println("OldCapacity:"+sb1.capacity());
		sb1.append("sachinrajuSachinRaut");
		System.out.println("OldCapacity 16+1*2:=> "+sb1.capacity()); //16*2+2=34 or 16+1*2=34
		
		
		
		//System.out.println(sb);	

	}

}
