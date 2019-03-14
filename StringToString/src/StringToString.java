
public class StringToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Friend fnd1 = new Friend("이종수");
		Friend fnd2 = new Friend("현주읜");
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
		return "제이름은 "+ myName + "입니다";
	}
}