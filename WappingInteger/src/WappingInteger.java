
public class WappingInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntWrapper intInst = new IntWrapper(3);
		showData(intInst);
		showData(new IntWrapper(7));
	}

	public static void showData(Object obj){
		System.out.println(obj);
	}
	
}


class IntWrapper{
	
	private int num;
	
	public IntWrapper(int data){
		num = data;
	}
	
	public String toString(){
		return "22v    "+num;
	}
	
}
