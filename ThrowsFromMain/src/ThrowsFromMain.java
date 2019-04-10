import java.util.Scanner;

class AgeInputException extends Exception{
	
	public AgeInputException(){
		super("유효하지 않구나!");
	}
}

public class ThrowsFromMain {

	public static void main(String[] args) throws AgeInputException {
		// TODO Auto-generated method stub
		
		System.out.print("나이를 입력하세요.");
		int age = readAge();
	}
	
	public static int readAge() throws AgeInputException{
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age < 0){
			AgeInputException excpt = new AgeInputException();
			
			throw excpt;
		}
		
		return age;
	}

}
