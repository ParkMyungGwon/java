
public class LocalParamClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass out = new OuterClass("My Outer Class");
		Readable localInst1 = out.createLocalClassInst(111);
		localInst1.read();
		
		Readable localInst2 = out.createLocalClassInst(222);
		localInst2.read();
	}

}

interface Readable{
	public void read();
}

class OuterClass{
	
	private String myName;
	
	OuterClass(String name){
		this.myName = name;
	}
	
	public Readable createLocalClassInst(final int instID){
		
		class LocalClass implements Readable{
			
			public void read(){
				System.out.println("Outer inst name : " + myName);
				System.out.println("Local inst Id : " + instID);
			}
			
		}
		return new LocalClass();
	}
	
}
