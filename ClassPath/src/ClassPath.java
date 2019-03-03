
public class ClassPath {
	
	public static void main(String[] args){
		
		AAA aaa= new AAA();
		aaa.printName();
		
		BBB bbb = new BBB();
		bbb.printName();
	}

}


class AAA{
	public void printName(){
		System.out.println("aa");
		
	}
}

class BBB{
	public void printName(){
		System.out.println("bbb");
	}
}