
public class HowMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("am : " + AreaMath.calCircleArea(5.5));
		System.out.println("���簢�� : " + PerimeterMath.calRectanglePeri(2.0, 4.0));
	}

}
class SimpleMath{
	
	public static final double PI = 3.1415;
	public static double add(double a, double b){return a+b; }
	public static double min(double a, double b){return a-b; }
	public static double mul(double a, double b){return a*b; }
}
class AreaMath{
	public  static double calCircleArea(double rad){
		
		double result = SimpleMath.mul(rad, rad);
		result = SimpleMath.mul(result, SimpleMath.PI);
		
		return result;
	}
	
/*	public double calRectangleArea(double width , double height){
		
		return  double.mul(width, height);
	}*/
	
}

class PerimeterMath{
	
	public double calCirclePeri(double rad){
		double result =  SimpleMath.mul(rad, 2);
		result = SimpleMath.mul(result, SimpleMath.PI);
		return result;
		
	}

	
	public static double calRectanglePeri(double width, double height){
		return SimpleMath.add(SimpleMath.mul(width, 2), SimpleMath.mul(height, 2));
	}
	
	
}