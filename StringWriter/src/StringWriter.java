import java.io.*;

public class StringWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter out = new BufferedWriter(new FileWriter("c:\\11.txt"));
		
		out.write("12344");
		out.newLine();
		out.write("12344");
		out.newLine();
		out.write("12344");
		out.newLine();
		out.write("12344");
		out.newLine();
		out.write("12344");
		out.newLine();
		out.write("12344");
		out.newLine();
		out.write("12344");
		out.newLine();
		out.write("12344");
		out.newLine();
		out.write("12344");
		out.newLine();
		out.write("12344");
		out.newLine();
		out.close();
		System.out.println("ÀÔ·Â ³¡");
	}

}
