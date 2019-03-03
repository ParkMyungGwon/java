
public class ClassVarUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(1.2);
		c1.showPerimeter();
		c1.showArea();
	}

}

class Circle{
	
	static final double PI = 3.14;
	private double radius;
	
	public Circle(double rad) {radius = rad;}
	
	public void showPerimeter(){
		double peri = (radius*2) * PI;
		System.out.println("�ѷ� : " + peri);
	}
	
	public void showArea(){
		double area = (radius * radius) * PI;
		System.out.println("���� : " + area);
	} 
}