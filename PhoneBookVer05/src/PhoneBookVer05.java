import java.util.Scanner;

public class PhoneBookVer05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PhoneBookManager manager = PhoneBookManager.createManagerInst();
		
		int choice;
		
		while(true){
			
			MenuViewer.showMenu();
			choice = MenuViewer.keyboard.nextInt();
			MenuViewer.keyboard.nextLine();
			
			switch(choice){
			case INIT_MENU.INPUT : 
				manager.inputData();
				break;
			case INIT_MENU.SEARCH :
				manager.searchData();
				break;
			case INIT_MENU.DELETE :
				manager.deleteData();
				break;
			case INIT_MENU.EXIT :
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

}
 interface INIT_MENU{
	int INPUT=1, SEARCH=2, DELETE=3, EXIT=4;
}

interface INIT_SELETE{
	int NORMAL=1, UNIV=2, COMPANY=3;
}

class PhoneInfo{
	String name;
	String phoneNumber;
	
	public PhoneInfo(String name, String num){
		this.name = name;
		phoneNumber = num;
	}
	
	public void showPhoneInfo(){
		System.out.println("name : " + name);
		System.out.println("phone : " + phoneNumber );
	}
}

class PhoneUnivInfo extends PhoneInfo{
	String major;
	int year;
	
	public PhoneUnivInfo(String name, String num, String major, int year){
		super(name, num);
		this.major = major;
		this.year = year;
	}
	
	public void showPhoneInfo(){
		super.showPhoneInfo();
		System.out.println("major : " + major);
		System.out.println("year : " + year);
	}
}

class PhoneCompanyInfo extends PhoneInfo{
	String company;
	
	public PhoneCompanyInfo(String name, String num, String company){
		super(name, num);
		this.company = company;
	}
	
	public void showPhoneInfo(){
		super.showPhoneInfo();
		System.out.println("company : " + company);
	}
}

class PhoneBookManager{
	final int MAX_CNT = 100;
	PhoneInfo[] infoStorage = new PhoneInfo[MAX_CNT];
	int curCnt = 0;
	
	static PhoneBookManager inst = null;
	
	public static PhoneBookManager createManagerInst(){
		
		if(inst == null){
			inst = new PhoneBookManager();
		}
		return inst;
	}
	
	private PhoneBookManager(){}
	
	
	private PhoneInfo readFriendInfo(){
		System.out.print(" 이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		
		System.out.print("전화 번호 :");
		String phone = MenuViewer.keyboard.nextLine();
		
		return new PhoneInfo(name, phone);
	}
	
	private PhoneInfo readUnivFriendInfo(){
		
		System.out.print(" 이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		
		System.out.print("전화 번호 :");
		String phone = MenuViewer.keyboard.nextLine();
		
		System.out.println("전공 : ");
		String major = MenuViewer.keyboard.nextLine();
		
		System.out.println("학년 : ");
		int year = MenuViewer.keyboard.nextInt();
		
		return new PhoneUnivInfo(name, phone, major, year);
		
	}
	
	
	private PhoneInfo readCompanyFriendInfo(){
		
		System.out.print(" 이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		
		System.out.print("전화 번호 :");
		String phone = MenuViewer.keyboard.nextLine();
		
		System.out.println("회사 : ");
		String company = MenuViewer.keyboard.nextLine();
		
		
		return new PhoneCompanyInfo(name, phone, company);
		
	}
	
	public void inputData(){
		System.out.println("데이터 입력을 시작합니다.");
		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.print("선택 >>");
		int choice = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		PhoneInfo info = null;
		
		switch(choice){
		case INIT_SELETE.NORMAL :
			info = readFriendInfo();
			break;
		
		case INIT_SELETE.UNIV :
			info = readUnivFriendInfo();
			break;
		
		case INIT_SELETE.COMPANY :
			info = readCompanyFriendInfo();
			break;
		}
		
		infoStorage[curCnt++] = info;
		System.out.println("데이터 입력이 완료 되었습니다.");
	}
	
	public void searchData(){
		System.out.println("데이터 검색을 시작 합니다..");
		System.out.print("이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		
		int dataIdx = search(name);
		
		if(dataIdx<0){
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		}
	}
	
	public void deleteData(){
		System.out.println("데이터 삭제를 시작합니다..");
		System.out.print("이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		
		int dataIdx = search(name);
		
		
		if(dataIdx < 0){
			System.out.println(" 해당하는 데이터가 존재하지 않습니다.");
		}else{
			for(int idx = dataIdx; idx<(curCnt-1); idx++)
				infoStorage[idx] = infoStorage[idx+1];
			
			curCnt--;
			System.out.println("데이터 삭제 완료!");
		}
		
		
	}
	
	private int search(String name){
		for(int idx=0; idx<curCnt; idx++){
			PhoneInfo curInfo = infoStorage[idx];
			if(name.compareTo(curInfo.name)==0)
				return idx;
		}
		return -1;
	}
}

class MenuViewer{
	public static Scanner keyboard = new Scanner(System.in);
	
	public static void showMenu(){
		System.out.println("선택하세요");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 프로그램 종료");
		System.out.print("선택 : ");
	}
	
	
}