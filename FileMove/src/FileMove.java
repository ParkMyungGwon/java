import java.io.File;

public class FileMove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File myFile = new File("c:\\11.txt");
		
		if(myFile.exists() == false){
			System.out.println("���� ������ �غ�Ǿ� ���� �ʽ�����");
			return;
		}
		
		
		File reDir = new File("C:\\bb");
		reDir.mkdir();
		
		File reFile = new File(reDir, "12.txt");
		
		myFile.renameTo(reFile);
		
		if(reFile.exists() == true){
			System.out.println("����");
		}else{
			System.out.println("���");
		}
	}

}
