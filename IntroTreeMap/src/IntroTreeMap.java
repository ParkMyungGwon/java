import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeMap;

public class IntroTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
		tMap.put(1, "Data1");
		tMap.put(3, "Data3");
		tMap.put(5, "Data5");
		tMap.put(2, "Data2");
		tMap.put(4, "Data4");
		
		NavigableSet<Integer> navi = tMap.navigableKeySet();
		
		System.out.println("오름차순 출력...");
		
		Iterator<Integer> itr = navi.iterator();
		
		while(itr.hasNext()){
			System.out.println(tMap.get(itr.next()));
		}
		
		System.out.println("내림차순");
		
		itr = navi.descendingIterator();
		
		while(itr.hasNext()){
			System.out.println(tMap.get(itr.next()));

		}
		
	}

}
