
public class StringToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Friend fnd1 = new Friend("������");
		Friend fnd2 = new Friend("������");
		Friend fnd3 = new Friend();
		System.out.println(fnd1);
		System.out.println(fnd3);
	}

}


class Friend{
	String myName;
	
	public Friend(String name){
		this.myName = name;
	}
	
	public Friend(){
		
	}
	
	public String toString(){
		return "���̸��� "+ myName + "�Դϴ�";
	}
}