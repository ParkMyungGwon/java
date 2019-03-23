
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseEnSpeaker bs = new BaseEnSpeaker();
		bs.setVolume(10);
		bs.setBaseRate(20);
		bs.showCurrentState();
	}

}


class BaseEnSpeaker extends Speaker{
	
	private int baseRate;
	
	public void showCurrentState(){
		super.showCurrentState();
		System.out.println("���̽� ũ�� : " + baseRate);
	}
	
	public void setBaseRate(int base){
		baseRate = base;
	}
	
}


class Speaker{
	private int volumeRate;
	
	public void showCurrentState(){
		System.out.println("����ũ�� :" + volumeRate);
	}
	
	public void setVolume(int vol){
		volumeRate = vol;
	}
}