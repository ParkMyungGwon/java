
public class OrangeaseOrangeBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OrangeBox fbox = new OrangeBox();
		fbox.store(new Orange(10));
		
		Orange org1 = fbox.pullOut();
		org1.showSugerContent();
		
		OrangeBox fbox2 = new OrangeBox();
		fbox2.store("¿À·»Áö");
		Orange org2 = fbox2.pullOut();
		org2.showSugerContent();
		
	}

}

class Orange{
	
	int sugarContent;
	public Orange(int suger){this.sugarContent = suger;}
	public void showSugerContent(){System.out.println("´çµµ : " + sugarContent);}
	
}

class OrangeBox{
	
	Orange item;
	public void store(Orange item) {this.item = item;}
	public Orange pullOut(){return item;}
	
}

