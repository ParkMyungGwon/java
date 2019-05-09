import java.util.Iterator;
import java.util.LinkedList;

public class IteratorUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<String> list = new LinkedList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		
		Iterator<String> itr = list.iterator();
		
		System.out.println("반복자 이용");
		
		while(itr.hasNext()){
			
			String cur = itr.next();
			System.out.println(cur);
			if(cur.compareTo("3")==0){
				itr.remove();
			}
			
		}
		
		System.out.println("\n\"Third\"삭제 후 반복자를 이용한 2차 출력" );
		
		itr =list.iterator();
		
		while(itr.hasNext()){
			
			System.out.println(itr.next());
			
		}
	}

}
