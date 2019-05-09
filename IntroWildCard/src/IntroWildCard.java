
public class IntroWildCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitBox<Fruit> box1 = new FruitBox<Fruit>();
		box1.store(new Fruit());
		
		FruitBox<Apple> box2 = new FruitBox<Apple>();
		box2.store(new Apple());
		
		openAndShowFruitBox(box1);
		openAndShowFruitBox(box2);
	}
	
	public static void openAndShowFruitBox(FruitBox<? extends Fruit> box){
		
		Fruit fruit= box.pullOut();
		fruit.showYou();
	}

	
}

class FruitBox<T>{
	
	T item;
	
	public void store(T item) {this.item = item;}
	
	public T pullOut() {return item;}
}

class Apple extends Fruit{
	
	public void showYou(){
		
		super.showYou();
		System.out.println("난 붉은 과일이야");
		
	}
	
}


class Fruit{
	
	public void showYou(){
		System.out.println("난 과일이야");
	}
	
}