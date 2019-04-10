
public class MultilnheriAlternative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPTV iptv = new IPTV();
		iptv.powerOn();
		
		Tv tv = iptv;
		Computer comp = iptv;
		
		iptv.dataReceive();
	}

}

class Tv{
	public void onTv(){
		System.out.println("영상 출력");
	}
}

interface Computer{
	public void dataReceive();
}

class ComputerImpl{
	public void dataReceive(){
		System.out.println("영상 데이터 수신 중");
	}
}

class IPTV extends Tv implements Computer{
	
	ComputerImpl comp = new ComputerImpl();
	
	public void dataReceive(){
		comp.dataReceive();
	}
	public void powerOn(){
		dataReceive();
		onTv();
	}
}