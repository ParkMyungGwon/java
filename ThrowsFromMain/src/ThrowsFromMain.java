import java.util.Scanner;

class AgeInputException extends Exception{
	
	public AgeInputException(){
		super("��ȿ���� �ʱ���!");
	}
}

public class ThrowsFromMain {

	public static void main(String[] args) throws AgeInputException {
		// TODO Auto-generated method stub
		
		System.out.print("���̸� �Է��ϼ���.");
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
