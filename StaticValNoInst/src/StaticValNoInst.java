
public class StaticValNoInst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstCnt.instNum-=15;
		System.out.println(InstCnt.instNum);
		
		InstCnt i = new InstCnt();
		System.out.println(i.instNum);
	}

}

class InstCnt{
	static int instNum = 100;
	
	public InstCnt(){
		instNum++;
		System.out.println("여기가먼저i??"+instNum);
	}
}
