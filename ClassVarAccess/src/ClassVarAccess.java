
public class ClassVarAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessWay way = new AccessWay();
		way.num++;
		System.out.println(way.num);
		
		AccessWay.num++;
		System.out.println(way.num);
	}

}

class AccessWay{
	
	static int num = 0;
	
	public AccessWay(){
		incrCnt();
	}
	
	public void incrCnt(){
		num++;
		System.out.println("���������???");
		System.out.println("incrCnt : " + num);
	}
	
}
