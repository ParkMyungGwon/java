
public class ThreadHeapMultiAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sum s = new Sum();
		AdderThread at1 = new AdderThread(s , 1, 50);
		AdderThread at2 = new AdderThread(s , 51, 100);

		at1.start();
		at2.start();
		try{
			at1.join();
			at2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	
		System.out.println("1~100 ±îÁö ÇÕ : " + s.getNum());
	
	}
	

}


class Sum{
	
	int num;
	
	public Sum(){ num = 0; }
	public void addNum(int n) {num += n;}
	public int getNum(){return num;}
	
	
}


class AdderThread extends Thread{
	
	Sum sumInst;
	int start, end;
	
	
	public AdderThread(Sum sum, int s, int e){
		
		sumInst = sum;
		start = s;
		end= e;
		
		
	}
	
	public void run(){
		
		for(int i=start; i <=end; i++){
			sumInst.addNum(i);
		}
	}
	
}

