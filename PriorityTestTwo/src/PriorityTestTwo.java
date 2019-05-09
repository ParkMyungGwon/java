
public class PriorityTestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageSendingTread tr1 = new MessageSendingTread("first", Thread.MAX_PRIORITY);
		MessageSendingTread tr2 = new MessageSendingTread("second", Thread.NORM_PRIORITY);
		MessageSendingTread tr3 = new MessageSendingTread("third", Thread.MIN_PRIORITY);
		
		tr1.start();
		tr2.start();
		tr3.start();
	}

}

class MessageSendingTread extends Thread{
	
	String message;
	
	
	public MessageSendingTread(String str, int prio){
		message = str;
		setPriority(prio);
	}
	
	public void run(){
		for(int i=0;i<1000000;i++)
			System.out.println(message+"("+getPriority()+")");
		
		try{
			
			sleep(1);
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}