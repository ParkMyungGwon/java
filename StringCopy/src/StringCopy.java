
public class StringCopy {

	public static void main(String[] args){
		
		String str1 = "Lemon";
		String str2 = "Lemon";
		String str3 = new String(str2);
		
		if(str1 == str2)
			System.out.println("1 ==2");
		else
			System.out.println("1!=2");
		
		if(str2 == str3)
			System.out.println("2==3");
		else
			System.out.println("2!=3");
		
	}
}
