
public class StringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("Hi my string");
		String str2 = new String("Hi my string");
		
		if(str1 == str2){
			System.out.println("==");
		}else{
			System.out.println("!=");
		}
		
		if(str1.equals(str2)){
			System.out.println("==");
		}else{
			System.out.println("!=");
		}
	}

}
