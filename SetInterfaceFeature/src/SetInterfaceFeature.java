import java.util.HashSet;
import java.util.Iterator;

public class SetInterfaceFeature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hSet = new HashSet<String>();
		hSet.add("1");
		hSet.add("2");
		hSet.add("3");
		hSet.add("1");
		
		System.out.println("저장된 데이터 수 : " + hSet.size());
		
		Iterator<String> itr = hSet.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
