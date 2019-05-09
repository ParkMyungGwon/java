import java.util.HashMap;

public class IntroHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		
		hMap.put(new Integer(3), "³ª»ï¹ø");
		hMap.put(5, "À±¿À¹ø");
		hMap.put(8, "¹ÚÆÈ¹ø");
		
		System.out.println("6-3 8, stu : " + hMap.get(new Integer(8)));
		System.out.println("6-3 5, stu : " + hMap.get(5));
		System.out.println("6-3 3, stu : " + hMap.get(3));
		
		hMap.remove(5);
		System.out.println("6-3 5, stu : " + hMap.get(5));
	}

}
