import java.util.StringTokenizer;

public class TokenizeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strData = "11:22:33:44:55";
		StringTokenizer st = new StringTokenizer(strData,":");
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}

}
