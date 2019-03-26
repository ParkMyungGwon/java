import java.util.Scanner;

public class MyFriendInfoBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FriendInfoHandler handler = new FriendInfoHandler(10);
		
		while(true){
			System.out.println("-----메뉴 선택 ------");
			System.out.println("1. 고교 정보 저장");
			System.out.println("2. 대학 친구 저장");
			System.out.println("3. 전체 정보 출력");
			System.out.println("4. 기본 정보 출력");
			System.out.println("5. 프로그램 종료");
			System.out.println("선택 >> ");
			
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			switch(choice){
			case 1 : case 2 :
				handler.addFriend(choice);
				break;
			case 3 :
				handler.showAllData();
				break;
			case 4 :
				handler.showAllSimpleData();
				break;
			case 5 :
				System.out.println("프로그램 종료0000");
				return;
			}
			
		}
	}

}


class Friend{
	
	String name;
	String phoneNum;
	String addr;
	
	public Friend(String name, String phone, String addr){
		this.name= name;
		this.phoneNum = phone;
		this.addr = addr;
	}
	
	public void showData(){
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + phoneNum);
		System.out.println("주소 : " + addr);
		
	}
	
	public void showBasicInfo(){ }
	
	
}

class HighFriend extends Friend{
	
	String work;
	
	public HighFriend(String name, String phone, String addr, String job) {
		super(name, phone, addr);
		work = job;
	}
	
	public void showData(){
		super.showData();
		System.out.println("직업 : " + work);
	}
	
	public void showBasicInfo(){
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + phoneNum);
	}

}


class UnivFriend extends Friend{
	String major;
	
	public UnivFriend(String name, String phone, String addr, String major){
		super(name, phone, addr);
		this.major = major;
	}
	
	public void showData(){
		super.showData();
		System.out.println("전공 : " + major);
	}
	
	public void showBasicInfo(){
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + phoneNum);
		System.out.println("전공 : " + major);
	}
	
}


class FriendInfoHandler{
	
	private Friend[] myFriends;
	private int numOfFriends;
	
	
	public FriendInfoHandler(int num){
		myFriends = new Friend[num];
		numOfFriends = 0;
	}
	
	private void addFriendInfo(Friend fren){
		myFriends[numOfFriends++] = fren;
	}
	
	public void addFriend(int choice){
		String name, phoneNum, addr, job, major;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : "); name = sc.nextLine();
		System.out.print("전화 : "); phoneNum = sc.nextLine();
		System.out.print("주소 : "); addr = sc.nextLine();
	
		if(choice == 1){
			System.out.print("직업 : "); job = sc.nextLine();
			addFriendInfo(new HighFriend(name, phoneNum, addr, job));
		}else{
			System.out.print("학과: "); major = sc.nextLine();
			addFriendInfo(new UnivFriend(name, phoneNum, addr, major));
		}
		System.out.println("입력 완료!\n");
	
	}
	
	public void showAllData(){
		for(int i=0; i<numOfFriends; i++){
			myFriends[i].showData();
			System.out.println("");
		}
	}
	
	
	public void showAllSimpleData(){
		for(int i=0; i<numOfFriends; i++){
			myFriends[i].showBasicInfo();
			System.out.println("");
		}
	}
	
	
	
}
