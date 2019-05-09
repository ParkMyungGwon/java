import java.util.HashSet;
import java.util.Iterator;

public class HashSetEqualityTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<SimpleNumber> hSet = new HashSet<SimpleNumber>();
		hSet.add(new SimpleNumber(10));
		hSet.add(new SimpleNumber(20));
		hSet.add(new SimpleNumber(30));
		System.out.println("저장된 수 : " + hSet.size());
		
		Iterator<SimpleNumber> itr = hSet.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}

class SimpleNumber{
	
	int num;
	
	public SimpleNumber(int n){
		num = n;
	}
	
	public String toString(){
		return String.valueOf(num);
	}
	
	public int hashCode(){
		return num%3;
	}
	
	public boolean equals(Object obj){
		SimpleNumber comp = (SimpleNumber)obj;
		
		if(comp.num == num){
			return true;
		}else{
			return false;
		}
	}
}
