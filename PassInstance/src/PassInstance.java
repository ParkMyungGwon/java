
public class PassInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Number nInst = new Number();
		System.out.println("�޼ҵ� ȣ�� �� : " + nInst.getNumber());
		
		simpleMethod(nInst);
		
		System.out.println("�޼ҵ� ȣ�� ��" + nInst.getNumber());
	}

	public static void simpleMethod(Number numb) {
		// TODO Auto-generated method stub
		numb.addNum(12);
	}
	
	

}


class Number{
	
	int num = 0;
	public void addNum(int n){
		num+=n;
	}
	
	public int getNumber(){
		return num;
	}
	
}