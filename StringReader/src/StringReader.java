import java.io.*;

public class StringReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new FileReader("c:\\11.txt"));
		
		String str;
		
		while(true){
			
			str = in.readLine();
			
			if(str == null){
				break;
			}
			
			System.out.println(str);
		}
		in.close();
	}

}
