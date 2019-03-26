
public class ShowAllReDecl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCC c = new CCC();
		c.showAllNums();
	}

}

class AAA{
	
	public int num = 2;
}

class BBB extends AAA{
	public int num = 5;
	public void showSuperNum(){
		System.out.println("AAA's num : " + super.num);
	}
}

class CCC extends BBB{
	public int num = 7;
	
	public void showAllNums(){
		super.showSuperNum();
		System.out.println("bbb's num : " + super.num);
		System.out.println("ccc's num : " + num);
	}
}