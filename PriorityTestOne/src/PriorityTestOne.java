
public class PriorityTestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MessageSendingTread tr1 = new MessageSendingTread("first");
		MessageSendingTread tr2 = new MessageSendingTread("second");
		MessageSendingTread tr3 = new MessageSendingTread("third");
		
		tr1.start();
		tr2.start();
		tr3.start();
	}

}

class MessageSendingTread extends Thread{
	
	String message;
	
	public MessageSendingTread(String str){
		message = str;
	}
	
	public void run(){
		for(int i=0;i<1000000;i++)
			System.out.println(message+"("+getPriority()+")");
	}
}
