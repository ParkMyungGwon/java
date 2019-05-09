import java.io.*;

public class PrintWriterStream {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		PrintWriter out = new PrintWriter(new FileWriter("c:\\11.txt"));
		
		out.printf("제 나이느 %d", 24);
		out.println("");
		out.println("전 자바가 좋아영");
		out.print("특히 i/o");
		out.print("특히 i/o");
		out.close();
	}

}
