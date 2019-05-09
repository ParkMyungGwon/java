import java.io.File;

public class FileMove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File myFile = new File("c:\\11.txt");
		
		if(myFile.exists() == false){
			System.out.println("원본 파일이 준비되어 있지 않습ㄴ디ㅏ");
			return;
		}
		
		
		File reDir = new File("C:\\bb");
		reDir.mkdir();
		
		File reFile = new File(reDir, "12.txt");
		
		myFile.renameTo(reFile);
		
		if(reFile.exists() == true){
			System.out.println("성공");
		}else{
			System.out.println("퇴사");
		}
	}

}
