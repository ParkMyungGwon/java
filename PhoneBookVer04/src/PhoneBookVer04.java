import java.util.Scanner;

public class PhoneBookVer04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PhoneBookManager manager = new PhoneBookManager();
		
		int choice;
		
		while(true){
			
			MenuViewer.showMenu();
			choice = MenuViewer.keyboard.nextInt();
			MenuViewer.keyboard.nextLine();
			
			switch(choice){
			case 1 : 
				manager.inputData();
				break;
			case 2 :
				manager.searchData();
				break;
			case 3 :
				manager.deleteData();
				break;
			case 4 :
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
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
	
	public void inputData(){
		System.out.println("������ �Է��� �����մϴ�.");
		System.out.println("1. �Ϲ�, 2. ����, 3. ȸ��");
		System.out.print("���� >>");
		int choice = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		PhoneInfo info = null;
		
		switch(choice){
		case 1 :
			info = readFriendInfo();
			break;
		
		case 2 :
			info = readUnivFriendInfo();
			break;
		
		case 3 :
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