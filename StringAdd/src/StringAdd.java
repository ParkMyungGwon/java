
public class StringAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		String str1 = "Lemon" + "add";
		String str2 = "Lemon" + 'A';
		String str3 = "Lemon" + 3;
		String str4 = 1 + "Lemon" + 2;
		str4 += '!';*/
		
		//String str1 = "Lemon".concat('A');
		String str1 = "Lemon".concat(String.valueOf(333));
		String str2 = "Lemon".concat(String.valueOf('a'));
		String str3 = "Lemon" + 3;
		String str4 = 1 + "Lemon" + 2;
		str4 += '!';
		
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
	}

}
