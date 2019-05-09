
public class ThreadUnderstand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShowThread st1 = new ShowThread("���� ������");
		ShowThread st2 = new ShowThread("���� ������");
		
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
			
			System.out.println("�ȳ��ϼ���. " + str + "�Դϴ�.");
			
			try{
				
				sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
}