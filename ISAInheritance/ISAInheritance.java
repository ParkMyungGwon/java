
public class ISAInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NotebookCome nc = new NotebookComp("이수종", 5);
		TabletNotebook tn = new TabletNotebook("정수영", 5 , "ISE-241-242");
		
		nc.movingCal();
		tn.write("ISE-241-242");
	}

}

class TavleNotebook extends NotebookCome{
	
	String regstPenModel;
	
	public TabletNotebook(String name, int initChag, String pen){
		super(name, initChang);
		regstPenModel= pen;
	}
	
	public void write(String penInfo){
		if(battery < 1){
			System.out.println("충전이 필요합니다");
			return;
		}
		
		if(regstPenModel.compareTo(penInfo) != 0){
			System.out.println("등록된 펜이 아닙니다.");
		}
		System.out.println("필기 내용을 처리합니다.");
		battery -=1;
	}
	
	
}

class NotebookCome extends Computer{
	
	int battery;
	
	public NotebookCome(String name, int initChag){
		
		super(name);
		batterty = initChag;
	}
	
	public void charging(){ battery +=5;}
	public void movingCal(){
		
		if(battery < 1){
			System.out.println("충전이 필요하오");
			return;
		}
		System.out.println("이동하면ㅅ거");
		calculater();
		battery -=1;
	}
	
}

class Computer{
	String owner;
	
	public Computer(String name) {owner = name;}
	public void calculate(){System.out.println("요청내용 계산");}
}