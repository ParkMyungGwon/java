import java.io.*;

public class PastReadInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			
			BufferedReader br = new BufferedReader(isr);
			System.out.print("���� �Է� :");
			
			String str = br.readLine();
			int num = Integer.parseInt(str);
			System.out.println("�Էµ� ���� : " + num);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
