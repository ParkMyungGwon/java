import java.util.*;


public class ScanningMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("����� �̸���??");
		String str = keyboard.nextLine();
		System.out.println("�ȳ��ϼ���"+ str + "��");
		
		System.out.println("����� ���İ�Ƽ�� �����Ѵٴµ� �����Դϱ�?");
		boolean isTrue = keyboard.nextBoolean();
		if(isTrue == true)
			System.out.println("����");
		else
			System.out.println("�Ⱦ�");
		
		System.out.println("��Ű� ������ Ű�� ��� �ǳ���?");
		
		double num1 =  keyboard.nextDouble();
		double num2 = keyboard.nextDouble();
		
		double diff = num1 - num2;
		
		if(diff>0)
			System.out.println("�����" + diff + "��ŭ ũ����");
		else
			System.out.println("�����" + (-diff) + "��ŭ �۱���");
	}

}
