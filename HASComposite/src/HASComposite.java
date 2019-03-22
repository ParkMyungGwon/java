
public class HASComposite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Police haveGun = new Police(5, 3);
		haveGun.shot();
		haveGun.putHandcuff();
		
		Police dontHaveGun = new Police(0, 3);
		dontHaveGun.shot();
	}

}

class Police{
	
	int handcuffs;
	Gun pistol;
	
	public Police(int bnum, int bcuff){
		handcuffs = bcuff;
		
		
		if(bnum != 0)
			pistol = new Gun(bnum);
		else
			pistol = null;
	}
	
	public void putHandcuff(){
		System.out.println("SNAP!");
		handcuffs--;
	}
	
	public void shot(){
		if(pistol == null)
			System.out.println("Hut BBANG!");
		else
			pistol.shot();
	}
}

class Gun{
	int bullet;
	
	public Gun(int bnum) {bullet = bnum;}
	
	public void shot(){
		System.out.println("--");
		bullet--;
	}
}