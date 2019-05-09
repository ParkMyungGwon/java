import java.util.Scanner;

public class PhoneBookVer06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PhoneBookManager manager = PhoneBookManager.createManagerInst();
		
		int choice;
		
		while(true){
			
			try{
				MenuViewer.showMenu();
				choice = MenuViewer.keyboard.nextInt();
				MenuViewer.keyboard.nextLine();
				
				if(choice < INIT_MENU.INPUT || choice > INIT_MENU.EXIT)
					throw new MenuChoiceException(choice);
				
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
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}
			}
			catch(MenuChoiceException e){
				e.showWrongChoice();
				System.out.println("�޴������� �ٽ� ����");
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

class MenuChoiceException extends Exception{
	int wrongChoice;
	
	public MenuChoiceException(int choice){
		super("�߸��� ����");
		wrongChoice = choice;
	}
	
	public void showWrongChoice(){
		System.out.println(wrongChoice + "�� �ش��ϴ� ������ �������� �ʽ��ϴ�.");
	}
	
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
		System.out.print(" �̸� : ");
		String name = MenuViewer.keyboard.nextLine();
		
		System.out.print("��ȭ ��ȣ :");
		String phone = MenuViewer.keyboard.nextLine();
		
		return new PhoneInfo(name, phone);
	}
	
	private PhoneInfo readUnivFriendInfo(){
		
		System.out.print(" �̸� : ");
		String name = MenuViewer.keyboard.nextLine();
		
		System.out.print("��ȭ ��ȣ :");
		String phone = MenuViewer.keyboard.nextLine();
		
		System.out.println("���� : ");
		String major = MenuViewer.keyboard.nextLine();
		
		System.out.println("�г� : ");
		int year = MenuViewer.keyboard.nextInt();
		
		return new PhoneUnivInfo(name, phone, major, year);
		
	}
	
	
	private PhoneInfo readCompanyFriendInfo(){
		
		System.out.print(" �̸� : ");
		String name = MenuViewer.keyboard.nextLine();
		
		System.out.print("��ȭ ��ȣ :");
		String phone = MenuViewer.keyboard.nextLine();
		
		System.out.println("ȸ�� : ");
		String company = MenuViewer.keyboard.nextLine();
		
		
		return new PhoneCompanyInfo(name, phone, company);
		
	}
	
	public void inputData() throws MenuChoiceException{
		System.out.println("������ �Է��� �����մϴ�.");
		System.out.println("1. �Ϲ�, 2. ����, 3. ȸ��");
		System.out.print("���� >>");
		int choice = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		PhoneInfo info = null;
		
		System.out.println(choice);
		if(choice < INIT_SELETE.NORMAL || choice > INIT_SELETE.COMPANY){
			throw new MenuChoiceException(choice);
		}
		
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
		System.out.println("������ �Է��� �Ϸ� �Ǿ����ϴ�.");
	}
	
	public void searchData(){
		System.out.println("������ �˻��� ���� �մϴ�..");
		System.out.print("�̸� : ");
		String name = MenuViewer.keyboard.nextLine();
		
		int dataIdx = search(name);
		
		if(dataIdx<0){
			System.out.println("�ش��ϴ� �����Ͱ� �������� �ʽ��ϴ�. \n");
		}
	}
	
	public void deleteData(){
		System.out.println("������ ������ �����մϴ�..");
		System.out.print("�̸� : ");
		String name = MenuViewer.keyboard.nextLine();
		
		int dataIdx = search(name);
		
		
		if(dataIdx < 0){
			System.out.println(" �ش��ϴ� �����Ͱ� �������� �ʽ��ϴ�.");
		}else{
			for(int idx = dataIdx; idx<(curCnt-1); idx++)
				infoStorage[idx] = infoStorage[idx+1];
			
			curCnt--;
			System.out.println("������ ���� �Ϸ�!");
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
		System.out.println("�����ϼ���");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ������ �˻�");
		System.out.println("3. ������ ����");
		System.out.println("4. ���α׷� ����");
		System.out.print("���� : ");
	}
	
	
}