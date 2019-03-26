
public class ValReDecle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCC ref1 = new CCC();
		BBB ref2 = new CCC();
		AAA ref3 = new BBB();
		
		System.out.println("CCC's ref : " + ref1.num);
		System.out.println("B's ref : " + ref2.num);
		System.out.println("A's ref : " + ref3.num);
	}

}

class CCC extends BBB{
	public int num = 7;
}

class BBB extends AAA{
	public int num = 5;
}

class AAA{
	public int num = 2;
}