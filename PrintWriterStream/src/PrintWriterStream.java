import java.io.*;

public class PrintWriterStream {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		PrintWriter out = new PrintWriter(new FileWriter("c:\\11.txt"));
		
		out.printf("�� ���̴� %d", 24);
		out.println("");
		out.println("�� �ڹٰ� ���ƿ�");
		out.print("Ư�� i/o");
		out.print("Ư�� i/o");
		out.close();
	}

}
