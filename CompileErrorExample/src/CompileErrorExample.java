
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
		System.out.println("���� ���");
	}
}

class Computer{
	public void dataReceive(){
		System.out.println("���� ������ ���� ��");
	}
}

class IPTV extends Tv, Computer{
	public void powerOn(){
		
	}
}