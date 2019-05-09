
public class ObjectBaseFruitBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FruitBox fbox = new FruitBox();
		fbox.store(new Orange(10));
		
		Orange org1 = (Orange)fbox.pullOut();
		org1.showSugerContent();
		
		FruitBox fbox2 = new FruitBox();
		fbox2.store("¿À·»Áö");
		Orange org2 = (Orange)fbox2.pullOut();
		org2.showSugerContent();
		
	}

}



class FruitBox{
	
	Object item;
	public void store(Object item) {this.item = item;}
	public Object pullOut(){return item;}
}

class Orange{
	
	int sugarContent;
	public Orange(int suger){this.sugarContent = suger;}
	public void showSugerContent(){System.out.println("´çµµ : " + sugarContent);}
	
}