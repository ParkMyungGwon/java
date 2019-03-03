
public class Encapsulation1 {

	public static void main(String[] args){
		
		ColdPatient sufferer = new ColdPatient();

		sufferer.takeSinivalCap(new SinivelCap());
		sufferer.takeSneezeCap(new SneezeCap());
		sufferer.takeSnuffleCap(new SnuffleCap());
	}
}

class ColdPatient{
	public void takeSinivalCap(SinivelCap cap){ cap.take();}
	public void takeSneezeCap(SneezeCap cap){ cap.take();}
	public void takeSnuffleCap(SnuffleCap cap){ cap.take();}
	
}

class SnuffleCap{
	public void take(){
		System.out.println("�ڻ�");
	}
}
class SinivelCap{
	
	public void take(){
		System.out.println("�๰ ����");
	}
}

class SneezeCap{
	public void take(){ System.out.println("��ä�� ����");}
}