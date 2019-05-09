
public class SoSimpleLinkeListImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box<String> boxHead = new Box<String>();
		boxHead.store("Fi ~ St~");
		
		boxHead.nextBox = new Box<String>();
		boxHead.nextBox.store("2");
		
		boxHead.nextBox.nextBox = new Box<String>();
		boxHead.nextBox.nextBox.store("3");
		
		Box<String> tempRef;
		
		tempRef = boxHead.nextBox;
		System.out.println(tempRef.pullOut());
		
		tempRef = boxHead.nextBox;
		
		tempRef = tempRef.nextBox;
		System.out.println(tempRef.pullOut());
	}

}


class Box<T>{
	
	public Box<T> nextBox;
	
	T item;
	
	public void store(T item){ this.item = item;}
	public T pullOut() {return item;}
	
}