
public class ISAInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NotebookCome nc = new NotebookCome("�̼���", 5);
		TabletNotebook tn = new TabletNotebook("������", 5 , "ISE-241-242");
		
		nc.movingCal();
		tn.write("ISE-241-242");
	}

}

class TabletNotebook extends NotebookCome{
	
	String regstPenModel;
	
	public TabletNotebook(String name, int initChag, String pen){
		super(name, initChag);
		regstPenModel= pen;
	}
	
	public void write(String penInfo){
		if(battery < 1){
			System.out.println("������ �ʿ��մϴ�");
			return;
		}
		
		if(regstPenModel.compareTo(penInfo) != 0){
			System.out.println("��ϵ� ���� �ƴմϴ�.");
		}
		System.out.println("�ʱ� ������ ó���մϴ�.");
		battery -=1;
	}
	
	
}

class NotebookCome extends Computer{
	
	int battery;
	
	public NotebookCome(String name, int initChag){
		
		super(name);
		battery = initChag;
	}
	
	public void charging(){ battery +=5;}
	public void movingCal(){
		
		if(battery < 1){
			System.out.println("������ �ʿ��Ͽ�");
			return;
		}
		System.out.println("�̵��ϸ餵��");
		calculate();
		battery -=1;
	}
	
}

class Computer{
	String owner;
	
	public Computer(String name) {owner = name;}
	public void calculate(){System.out.println("��û���� ���");}
}