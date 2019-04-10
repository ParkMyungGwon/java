import java.util.Scanner;

public class ProgrammerDefineException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("나이를 입력하세요 : ");
		
		try{
			int age = readAge();
			System.out.println("당신은" + age + "세 입니다.");
		}
		catch(AgeInputException e){
			System.out.println(e.getMessage());
		}
	}
	
	public static int readAge() throws AgeInputException{
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		if(age <0){
			AgeInputException excpt = new AgeInputException();
			throw excpt;
		}
		return age;
	}

}

class AgeInputException extends Exception{
	
	public AgeInputException(){
		super("유효하지 않은 나이가 입력되었습니다.");
	}
}