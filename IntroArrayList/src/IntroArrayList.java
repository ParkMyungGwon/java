import java.util.ArrayList;

public class IntroArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println("1Â÷ ÂüÁ¶");
		
		for(int i = 0 ; i < list.size(); i++){
			System.out.println(list.get(i));
			
		}
		
		list.remove(0);
		for(int i = 0 ; i < list.size(); i++){
			System.out.println(list.get(i));
			
		}
		
	}

}
