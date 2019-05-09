import java.io.*;

public class FileReaderStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		char[] cbuf = new char[10];
		int readCnt;
		
		Reader in = new FileReader("c:\\11.txt");
		readCnt = in.read(cbuf, 0, cbuf.length);
		
		for(int i=0 ; i<readCnt ; i++){
			System.out.println(cbuf[i]);
		}
	}

}
