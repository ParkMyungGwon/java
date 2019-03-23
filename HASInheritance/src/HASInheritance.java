
public class HASInheritance {

	
	public static void main(String[] args){
		Police pman = new Police(5, 3);
		
		pman.shot();
		pman.putHandcuff();
		
	}
}


class Police extends Gun {
	int handcuffs;
	
	public Police(int bnum, int bcuff){
		super(bnum);
		handcuffs = bcuff;
	}
	
	public void putHandcuff(){
		System.out.println("snap1");
		handcuffs--;
	}
}

class Gun{
	int bullet;
	
	public Gun(int bnum) {bullet = bnum;}
	
	public void shot(){
		System.out.println("bbang!");
		bullet--;
	}
	
}