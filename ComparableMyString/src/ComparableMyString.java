import java.util.Iterator;
import java.util.TreeSet;

public class ComparableMyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<MyString> tSet = new TreeSet<MyString>();
		tSet.add(new MyString("Orange"));
		tSet.add(new MyString("Apple"));
		tSet.add(new MyString("Dog"));
		tSet.add(new MyString("Individual"));
		
		Iterator<MyString> itr = tSet.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}


class MyString implements Comparable<MyString>{
	
	String str;
	
	public MyString(String str){ this.str = str;}
	
	public int getLength(){ return str.length();}
	
	public int compareTo(MyString mStr){
		
		if(getLength()>mStr.getLength())
			return 1;
		else if(getLength()<mStr.getLength())
			return -1;
		else
			return 0;
	}
	public String toString(){ return str;}
	
}