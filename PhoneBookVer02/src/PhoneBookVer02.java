import java.util.*;

public class PhoneBookVer02 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int choice;
		
		while(true){
			
			showMenu();
			choice=sc.nextInt();
			sc.nextLine();
		
		switch(choice){
		case 1 :
			readData();
			break;
		case 2 :
			System.out.println("���α׷� ����");
			return;
		}
	}
	

	
}
	public static void showMenu(){
		
		System.out.println("�����ϼ���");
		System.out.println("1. ������ �Է� : ");
		System.out.println("2. ���α׷� ���� :");
		System.out.print("���� : ");
	}

	public static void readData(){
		System.out.print(" �̸� :");
		String name = sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String phone = sc.nextLine();
		
		System.out.print("���� ���� : ");
		String birth = sc.nextLine();
		
		PhoneInfo info = new PhoneInfo(name, phone, birth);
		System.out.println("\n �Էµ� ���� ��� ...");
		info.ShowPhoneInfo();
	}

}

class PhoneInfo{
	String name;
	String phoneNumber;
	String birth;
	
	public PhoneInfo(String name, String num, String birth){
		this.name = name;
		this.phoneNumber = num;
		this.birth = birth;
	}
	
	public PhoneInfo(String name, String num){
	
		this.name = name;
		phoneNumber = num;
		this.birth = null;
	}
	
	public void ShowPhoneInfo(){
		System.out.println("name :" + name);
		System.out.println("phone :" + phoneNumber);
		
		if(birth != null){
			System.out.println("birth : " + birth);
		}else{
			System.out.println("");
		}
	}
	
	}