import java.util.HashSet;
import java.util.Iterator;

public class HashSetEqualityOne {

	public static void main(String[] args){
		
		HashSet<SimpleNumber> hSet = new HashSet<SimpleNumber>();
		hSet.add(new SimpleNumber(10));
		hSet.add(new SimpleNumber(20));
		hSet.add(new SimpleNumber(30));
		
		System.out.println("저장된 데이터의 수 : " + hSet.size());
		
		
		Iterator<SimpleNumber> itr = hSet.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}


class SimpleNumber{
	
	int n;
	
	public SimpleNumber(int n){
		this.n = n;
	}
	
	public String toString(){
		return String.valueOf(n);
	}
	
}