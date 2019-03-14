
public class SelfReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleAdder adder = new SimpleAdder();
		adder.add(1).add(3).add(5).showResult();
	}

}

class SimpleAdder{
	
	private int num;
	
	public SimpleAdder() { num = 0; }
	
	public SimpleAdder add(int num){
		this.num += num;
		return this;
	}
	
	public void showResult(){
		System.out.println("add result :" + num );
	}
	
}
