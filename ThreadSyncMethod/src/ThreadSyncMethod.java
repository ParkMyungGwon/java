
public class ThreadSyncMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Caculator cal = new Caculator();
		AddThread at = new AddThread(cal);
		MinThread mt = new MinThread(cal);
		
		at.start();
		mt.start();
		
		try{
			at.join();
			mt.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		cal.showOpCnt();
	}	

	
}


class Caculator{
	int opCnt = 0;
	
	public int add(int n1, int n2){
		opCnt++;
		return n1+n2;
	}
	
	public int min(int n1, int n2){
		opCnt++;
		return n1-n2;
	}
	
	public void showOpCnt(){
		System.out.println("ÃÑ ¿¬»ê È½¼ö : "+ opCnt);
	}
}

class AddThread extends Thread{
	
	Caculator cal;
	
	public AddThread(Caculator cal){ this.cal = cal;}
	
	public void run(){
		System.out.println("1+2="+cal.add(1, 2));
		System.out.println("1+2="+cal.add(2, 4));
	}
	
}

class MinThread extends Thread{
	
	Caculator cal;
	
	public MinThread(Caculator cal){ this.cal= cal;}

	public void run(){
		System.out.println("2-1="+cal.min(2, 1));
		System.out.println("4-2="+cal.min(4, 2));
	}
}