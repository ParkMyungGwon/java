
public class UseWrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer intInst = new Integer(3);
		
		showData(intInst);
		showData(new Integer(7));
	}
	
	public static void showData(Object obj){
		System.out.println(obj);
	}

}
