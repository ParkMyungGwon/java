import java.util.Scanner;

public class PhoneBookVer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PhoneBookManager manager = new PhoneBookManager();
		
		int choice;
		
		while(true){
			
			MenuViewer.showMenu();
			
			choice = MenuViewer.keyboard.nextInt();
			MenuViewer.keyboard.nextLine();
			
			
			switch(choice){

			case 1: 
				manager.inputData();
				break;
				
			case 2: 
				manager.searchData();
				break;
				
			case 3: 
				manager.deleteData();
				break;
				
			case 4: 
				System.out.println("프로그램 종료");
				return;
			}
			
		}
	}

}

class MenuViewer{
	
	public static Scanner keyboard = new Scanner(System.in);
	
	public static void showMenu(){
		
		System.out.println("선택하세요,,,");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 프로그램 종료");
		System.out.printf("선택 : ");
	}
	
}


class PhoneBookManager{
	
	final int MAX_CNT = 100;
	PhoneInfo[] infoStorage = new PhoneInfo[MAX_CNT];
	int curCnt = 0 ;
	
	
	public void inputData(){
		System.out.println("데이터 입력 시작!");
		
		System.out.print("이름 :");
		String name = MenuViewer.keyboard.nextLine();

		System.out.print("전화번호 : ");
		String phone = MenuViewer.keyboard.nextLine();
		

		System.out.print("생년월일 : ");
		String birth = MenuViewer.keyboard.nextLine();
		
		infoStorage[curCnt++] = new PhoneInfo(name, phone, birth);
	}
	
	public void searchData(){
		System.out.println("데이터 검색을 시작합니다");
		
		System.out.printf("이름 : " );
		String name = MenuViewer.keyboard.nextLine();
		
		int dataIdx = search(name);
		
		if(dataIdx < 0){
			System.out.println("해당되는 데이터가 존재하지 않습니다");
		}else{
			infoStorage[dataIdx].showPhoneInfo();
			System.out.println("데이터 검색이 종료되었습니다.");
		}
	}
	
	public void deleteData(){
		
		System.out.println(" 데이터 삭제 ");
		System.out.printf( "이름 : ");
		
		String name = MenuViewer.keyboard.nextLine();
		
		int dataIdx = search(name);
		
		if(dataIdx < 0){
			System.out.println("해당 데이터가 존재하지 않음");
		}else{
			
			for(int idx= dataIdx; idx<(curCnt-1); idx++){
				infoStorage[idx] = infoStorage[idx+1];
			}
			curCnt--;
			
			System.out.println("데이터 삭제가 완료되었습니다. \n");
		}
		
	}
	
	private int search(String name){
		
		for(int idx=0; idx< curCnt ; idx++){
			
			PhoneInfo curCnt = infoStorage[idx];
			
			if(name.compareTo(curCnt.name)==0){
				return idx;
			}
			
		}
		return -1;
	}
}



class PhoneInfo{
	
	String name;
	String phone;
	String birth;
	
	
	public PhoneInfo(String name, String phone, String birth){
		
		this.name = name;
		this.phone = phone;
		this.birth = birth;
		
	}
	
	public PhoneInfo(  String name, String phone){
		
		this.name = name;
		this.phone = phone;
		birth = null;
		
	}
	
	public void showPhoneInfo(){
		System.out.println("name :" + name);
		System.out.println("phone : " + phone);
		
		if(birth != null)
			System.out.println("birth : " + birth);
		
		System.out.println("");
	}
	
	

}