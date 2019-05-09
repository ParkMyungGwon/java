import java.io.*;

public class FileWriterStream {

	public static void main(String[] args ) throws IOException{
		// TODO Auto-generated method stub
		char ch1 = 'A';
		char ch2 = 'B';
		
		OutputStream out = new FileOutputStream("c://11.txt");
		
		out.write(ch1);
		out.write(ch2);
		out.close();
	}

}
