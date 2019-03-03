
class BBB {
	
	int bbb;
	public BBB(int num){ bbb = num; }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAA ins1 = new AAA(11);
		BBB ins2 = new BBB(22);
		System.out.println("ins1.aaa = " + ins1.aaa);
		System.out.println("ins2.bbb = " + ins2.bbb);
	}

}

class AAA{
	int aaa;
	public AAA(int num){ aaa= num;}
	
	public static void main(String[] args){
		AAA ins1 = new AAA(10);
		BBB ins2 = new BBB(20);
		
		System.out.println("ins1.aaa = " + ins1.aaa);
		System.out.println("ins2.bbb = " + ins2.bbb);
	}
}