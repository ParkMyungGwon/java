
public class Constructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number num1 = new Number();
		System.out.println(num1.getNumber());
		
		Number num2 = new Number();
		System.out.println(num2.getNumber());
	}

}

class Number{
	
	int num;
	
	public Number(){
		
		num = 20;
		System.out.println("������ ȣ��");
	}
	
	public int getNumber(){
	
		return num;
	}
}
