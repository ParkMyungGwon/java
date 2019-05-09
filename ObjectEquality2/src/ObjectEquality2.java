
public class ObjectEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntNumber num1 = new IntNumber(10);
		IntNumber num2 = new IntNumber(12);
		IntNumber num3 = new IntNumber(10);
		
		if(num1.isEquals(num2)){
			System.out.println("num1 == num2");
		}else
			System.out.println("n1 != n2");
		
		if(num1.isEquals(num3))
			System.out.println("n1 == n3");
		else
			System.out.println("n1 != n3");
	}

}

class IntNumber{
	int num;
	
	public IntNumber(int num){ this.num = num;}
	
	public boolean isEquals(Object obj){
		if(this.num == ((IntNumber)obj).num){
			return true;
		}else{
			return false;
		}
	}
	
	
}
