
public class HowMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaMath am = new AreaMath();
		PerimeterMath pm = new PerimeterMath();
		
		System.out.println("am : " + am.calCircleArea(5.5));
		System.out.println("직사각형 : " + pm.calRectanglePeri(2.0, 4.0));
	}

}
class SimpleMath{
	
	public static final double PI = 3.1415;
	public double add(double a, double b){return a+b; }
	public double min(double a, double b){return a-b; }
	public double mul(double a, double b){return a*b; }
}
class AreaMath{
	public double calCircleArea(double rad){
		
		SimpleMath sm = new SimpleMath();
		double result = sm.mul(rad, rad);
		result = sm.mul(result, SimpleMath.PI);
		
		return result;
	}
	
/*	public double calRectangleArea(double width , double height){
		SimpleMath sm = new SimpleMath();
		
		return sm.mul(width, height);
	}*/
	
}

class PerimeterMath{
	
/*	public double calCirclePeri(double rad){
		SimpleMath sm = new SimpleMath();
		double result = sm.mul(rad, 2);
		result = sm.mul(result, SimpleMath.PI);
		return result;
		
	}
*/	
	
	public double calRectanglePeri(double width, double height){
		SimpleMath sm = new SimpleMath();
		return sm.add(sm.mul(width, 2), sm.mul(height, 2));
	}
	
	
}