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
			System.out.println("프로그램 종료");
			return;
		}
	}
	

	
}
	public static void showMenu(){
		
		System.out.println("선택하세요");
		System.out.println("1. 데이터 입력 : ");
		System.out.println("2. 프로그램 종료 :");
		System.out.print("선택 : ");
	}

	public static void readData(){
		System.out.print(" 이름 :");
		String name = sc.nextLine();
		System.out.print("전화번호 : ");
		String phone = sc.nextLine();
		
		System.out.print("생년 월일 : ");
		String birth = sc.nextLine();
		
		PhoneInfo info = new PhoneInfo(name, phone, birth);
		System.out.println("\n 입력된 정보 출력 ...");
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