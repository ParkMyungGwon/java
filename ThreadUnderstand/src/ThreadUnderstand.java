
public class ThreadUnderstand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShowThread st1 = new ShowThread("멋진 쓰레드");
		ShowThread st2 = new ShowThread("예쁜 쓰레드");
		
		st1.start();
		st2.start();
	}

}


class ShowThread extends Thread{
	
	String str;
	
	public ShowThread(String str){
		this.str = str;
	}
	
	public void run(){
		for(int i=0; i<100; i++){
			
			System.out.println("안녕하세요. " + str + "입니다.");
			
			try{
				
				sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
}