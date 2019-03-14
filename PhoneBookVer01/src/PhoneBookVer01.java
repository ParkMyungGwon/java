
public class PhoneBookVer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneInfo pInfo1 = new PhoneInfo("������", "323-1111", "92,09,12");
		PhoneInfo pInfo2 = new PhoneInfo("��ȿ��", "321-2222");
		
		pInfo1.showPhoneInfo();
		pInfo2.showPhoneInfo();
		
	}

}


class PhoneInfo{
	
	String name;
	String phoneNumber;
	String birth;
	
	
	public PhoneInfo(String name, String phone, String birth){
		
		this.name = name;
		this.phoneNumber = phone;
		this.birth = birth;
		
	}
	
	public PhoneInfo(String name, String phone){
		this.name = name;
		this.phoneNumber = phone;
		this.birth = "null";
	}
	
	public void showPhoneInfo(){
		System.out.println(name);
		System.out.println(phoneNumber);
		
		if(birth == "null")
			System.out.println("���� ������ ������");
		else
			System.out.println(birth);
	}
	
}