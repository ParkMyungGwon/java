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
		
		System.out.println("�ݺ��� �̿�");
		
		while(itr.hasNext()){
			
			String cur = itr.next();
			System.out.println(cur);
			if(cur.compareTo("3")==0){
				itr.remove();
			}
			
		}
		
		System.out.println("\n\"Third\"���� �� �ݺ��ڸ� �̿��� 2�� ���" );
		
		itr =list.iterator();
		
		while(itr.hasNext()){
			
			System.out.println(itr.next());
			
		}
	}

}
