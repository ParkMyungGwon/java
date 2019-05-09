import java.io.*;

public class RelativePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File curDir = new File("AAAA");
		System.out.println(curDir.getAbsolutePath());
		

		File upperDir = new File("AAAA"+File.separator+"BBBB");
		System.out.println(upperDir.getAbsolutePath());
		
	}

}
