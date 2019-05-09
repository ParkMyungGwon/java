import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

interface INIT_MENU{
	int INPUT = 1, SEARCH = 2, DELETE =3, EXIT = 4;
}

interface INPUT_SELECT{
	int NORMAL = 1, UNIV = 2, COMPANY = 3;
}

class MenuChoiceException extends Exception{
	
	int wrongChoice;
	
	public MenuChoiceException(int choice){
		super("�߸��� ������ �̷������ϴ�.");
		
		wrongChoice = choice;
	}
	
	public void showWrongChoice(){
		System.out.println(wrongChoice + "�� �ش��ϴ� ������ �������� �ʽ��ϴ�.");
	}
	
}
class PhoneInfo implements Serializable{
	
	String name;
	String phoneNumber;
	
	public PhoneInfo(String name, String num){
		this.name = name;
		this.phoneNumber = num;
	}
	
	public void showPhoneInfo(){
		System.out.println("name : " + name);
		System.out.println("phone : " + phoneNumber);
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
		System.out.println("year :" + year);
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
	
	private final File dataFile = new File("c://13.txt");
	HashSet<PhoneInfo> infoStorage = new HashSet<PhoneInfo>();
	
	static PhoneBookManager inst = null;
	
	public static PhoneBookManager createManagerInst(){
		
		if(inst == null)
			inst = new PhoneBookManager();
		
		return inst;
	}
	
	public PhoneBookManager(){
		readFromFile();
	}
	
	private PhoneInfo readFriendInfo(){
		System.out.print("�̸� : ");
		String name = MenuViewer.keyboard.nextLine();
		
		System.out.print("��ȭ��ȣ : ");
		String phone = MenuViewer.keyboard.nextLine();
		
		return new PhoneInfo(name, phone);
	}
	
	private PhoneInfo readUnivFriendInfo(){
		System.out.print("�̸� : ");
		String name = MenuViewer.keyboard.nextLine();
		
		System.out.print("��ȭ��ȣ : ");
		String phone = MenuViewer.keyboard.nextLine();
		
		System.out.print("���� : ");
		String major = MenuViewer.keyboard.nextLine();
		
		System.out.print("�г� : ");
		int year = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		
		
		return new PhoneUnivInfo(name, phone, major, year);
	}
	
	private PhoneInfo readCompanyFriendInfo(){
		System.out.print("�̸� : ");
		String name = MenuViewer.keyboard.nextLine();

		System.out.print("��ȭ��ȣ : ");
		String phone = MenuViewer.keyboard.nextLine();
		
		System.out.print("ȸ�� : ");
		String company = MenuViewer.keyboard.nextLine();
		
		return new PhoneCompanyInfo(name, phone, company);

	}
	
	
	public void inputData() throws MenuChoiceException{
		System.out.println("������ �Է��� �����մϴ�.");
		System.out.println("1. �Ϲ� , 2. ����, 3.ȸ��");
		System.out.print("���� >>>");
		
		int choice = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		
		PhoneInfo info = null;
		
		if(choice<INPUT_SELECT.NORMAL || choice>INPUT_SELECT.COMPANY)
			throw new MenuChoiceException(choice);
		
		switch(choice){
		case INPUT_SELECT.NORMAL :
			info = readFriendInfo();
			break;
		
		case INPUT_SELECT.UNIV :
			info = readUnivFriendInfo();
			
		case INPUT_SELECT.COMPANY :
			info = readCompanyFriendInfo();
			break;
		}
		
		boolean isAdded = infoStorage.add(info);
		
		if(isAdded == true)
			System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.");
		else
			System.out.println("�̹� ����� ������ �Դϴ�.");
	}
	
	public void searchData(){
		
		System.out.println("������ �˻��� �����մϴ�...");
		
		System.out.print("�̸� : ");
		String name = MenuViewer.keyboard.nextLine();
		
		PhoneInfo info = search(name);
		
		if(info == null){
			System.out.println("�ش� �����Ͱ� ������");
		}else{
			info.showPhoneInfo();
			System.out.println("�����Ͱ� �˻� �Ǿ���" );
		}
	}
	
	public void deleteData(){
		
		System.out.println("������ ������ �����մϴ�...");
		
		System.out.print("�̸� : ");
		String name = MenuViewer.keyboard.nextLine();
		Iterator<PhoneInfo> itr = infoStorage.iterator();
		
		while(itr.hasNext()){
			
			PhoneInfo curInfo = itr.next();
			if(name.compareTo(curInfo.name)==0)
			{
				itr.remove();
				System.out.println("�����Ͱ� �����Ǿ����ϴ�.");
				return;
			}
		}
		System.out.println("�ش絥���Ͱ� �������� �ʽ��ϴ�.");
		
	}
	private PhoneInfo search(String name){
		
		Iterator<PhoneInfo> itr = infoStorage.iterator();
		
		while(itr.hasNext()){
			
			PhoneInfo curInfo = itr.next();
			
			if(name.compareTo(curInfo.name)==0)
				return curInfo;
			
		}
		return null;
	}
	public void storeToFile(){
		try{
			FileOutputStream file = new FileOutputStream(dataFile);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			Iterator<PhoneInfo> itr = infoStorage.iterator();
			
			while(itr.hasNext()){
				out.writeObject(itr.next());
			}
			
			out.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public void readFromFile(){
		
		if(dataFile.exists() == false)
			return;
		
		try{
			FileInputStream file = new FileInputStream(dataFile);
			ObjectInputStream in = new ObjectInputStream(file);
			
			while(true){
				PhoneInfo info = (PhoneInfo)in.readObject();
				if(info == null){
					break;
				}
				infoStorage.add(info);
			}
			
			in.close();
		}catch(IOException e){
			return;
		}
		catch(ClassNotFoundException e){
			return;
		}
		
	}
}

class MenuViewer{
	
	public static Scanner keyboard = new Scanner(System.in);
	
	public static void showMenu(){
		System.out.println("�����ϼ���...");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ������ �˻�");
		System.out.println("3. ������ ����");
		System.out.println("4. ���α׷� ����");
		System.out.print("���� : ");

	}

}


public class PhoneBookVer08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PhoneBookManager manager = PhoneBookManager.createManagerInst();
		
		int choice;
		
		while(true){
			try{
				MenuViewer.showMenu();
				choice  = MenuViewer.keyboard.nextInt();
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
				
				case INIT_MENU.EXIT :
					manager.storeToFile();
					System.out.println("����");
					return;
				}
			}catch(MenuChoiceException e){
				e.showWrongChoice();
				System.out.println("�޴� ������ ó������ �ٽ� �����ϵ��� ���ڱ������");
			}
		}
	}

}