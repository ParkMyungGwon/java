import java.util.Scanner;


class PersonalInfo{
	
	String name;
	int age;
	
	public PersonalInfo(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void showPersonalInfo(){
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
}

public class PrintStackTrace {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try{
			PersonalInfo readInfo = readPersonalInfo();
			readInfo.showPersonalInfo();
		}catch(AgeInputException e){
			e,PrintStackTrace();
		}catch(NameLengthException e){
			e.showWrongName();
			e.printStackTrace();
		}
	}
	
	
	public static PersonalInfo readPersonalInfo() throws AgeInputException, NameLengthException{
		
		String name = readName();
		int age = readAge();
		
		PersonalInfo pInfo = new PersonalInfo(name, age);
		return pInfo;
		
	}
	
	public static String readName() throws NameLengthException{
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		
		if(name.length() < 2){
			throw new NameLengthException(name);
		}
		
		return name;
	}

	public static int readAge() throws AgeInputException{
		
		System.out.print("나이 입력");
		int age = sc.nextInt();
		
		if(age < 0){
			throw new AgeInputException();
		}
		
		return age;
		
	}
	
}

class AgeInputException extends Exception{
	public AgeInputException(){
		super("유효하지 않은 나이가 입력되었오.");
	}
}


class NameLengthException extends Exception{
	
	String wrongName;
	
	public NameLengthException(){
		super("잘못된 이름인거같구나");
	}
	
	public NameLengthException(String name){
		super("잘못된 이름이 삽입되었습니다.");
		wrongName = name;
	}
	
	public void showWrongName(){
		System.out.println("잘못 입려된 이름 : " + wrongName);
	}
}


