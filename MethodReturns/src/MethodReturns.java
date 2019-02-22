
public class MethodReturns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = adder(4, 5);
		System.out.println("4+5 =" + result);
		
		System.out.println("3.6 Á¦°ö " + square(3.5));
	}

	public static int adder(int i, int j) {
		// TODO Auto-generated method stub
		
		int addResult = i + j;
		return addResult;
	}
	
	
	public static double square(double a){
		
		return a*a;
		
	}

}
