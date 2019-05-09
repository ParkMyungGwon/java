
public class BoxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer iValue = new Integer(10);
		
		Double dValue = new Double(2.2);

		System.out.println(iValue);
		System.out.println(dValue);
		
		iValue = new Integer(iValue.intValue()+10);
		dValue = new Double(dValue.doubleValue()+0.2);
		

		System.out.println(iValue);
		System.out.println(dValue);
	}

}
