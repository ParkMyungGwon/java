
public class CompileErrorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPTV iptv = new IPTV();
		iptv.powerOn();
		
		Tv tv = iptv;
		Computer comp = iptv;
	}

}


class Tv{
	public void onTv(){
		System.out.println("영상 출력");
	}
}

class Computer{
	public void dataReceive(){
		System.out.println("영상 데이터 수신 중");
	}
}

class IPTV extends Tv, Computer{
	public void powerOn(){
		
	}
}