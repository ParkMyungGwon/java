import java.util.Scanner;

public class ProgrammerDefineException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("���̸� �Է��ϼ��� : ");
		
		try{
			int age = readAge();
			System.out.println("�����" + age + "�� �Դϴ�.");
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
		super("��ȿ���� ���� ���̰� �ԷµǾ����ϴ�.");
	}
}