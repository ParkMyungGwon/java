
public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "tart111111";
		String str2 = "and";
		String str3 = "simple";
		String str4 = str1.concat(str2).concat(str3);
		
		System.out.println(str4);
		
		System.out.println(str4.length());
		
		if(str1.compareTo(str3)<0)
			System.out.println("str1이 앞선다");
		else
			System.out.println("str3이 앞선다");
	}

}
