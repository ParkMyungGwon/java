
public class NestedClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClassOne one = new OuterClassOne();
		OuterClassTwo two = new OuterClassTwo();
		
		OuterClassOne.NestedClass nts1 = new OuterClassOne.NestedClass();
		nts1.simpleMethod();
		
		// OuterClassTwo.NestedClass nts2 = new OuterClassTwo.NestedClass();
		// nts2.simpleMethod();
	}

}


class OuterClassTwo{
	
	OuterClassTwo(){
		NestedClass nst = new NestedClass();
		nst.simpleMethod();
	}
	
	private static class NestedClass{
		public void simpleMethod(){
			System.out.println("Nested Instance Method Two");
		}
	}
}

class OuterClassOne{
	
	OuterClassOne(){
		NestedClass nst = new NestedClass();
		nst.simpleMethod();
	}
	
	static class NestedClass{
		public void simpleMethod(){
			System.out.println("222222");
		}
	}
	
	
}