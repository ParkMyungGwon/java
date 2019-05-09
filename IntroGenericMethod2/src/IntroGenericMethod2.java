
public class IntroGenericMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAA aaa = new AAA();
		BBB bbb = new BBB();
		
		InstanceTypeShower2 shower = new InstanceTypeShower2();
		shower.<AAA, BBB>showInstType(aaa, bbb);
		shower.showInstType(aaa, bbb);
	}

}


class AAA{
	
	public String toString() {return "Class AAA"; }
	
}

class BBB{
	public String toString() {return "Class BBB";}
}

class InstanceTypeShower2{
	
	public <T, U> void showInstType(T inst1, U inst2){
		System.out.println(inst1);
		System.out.println(inst2);
	}
	
	
}