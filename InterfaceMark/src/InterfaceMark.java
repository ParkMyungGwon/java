
public class InterfaceMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PointOne pos1 = new PointOne(1, 1);
		PointTwo pos2 = new PointTwo(2, 2);
		PointOne pos3 = new PointOne(3, 3);
		PointTwo pos4 = new PointTwo(4, 4);
		
		ClassPrinter.print(pos1);
		ClassPrinter.print(pos2);
		ClassPrinter.print(pos3);
		ClassPrinter.print(pos4);
	}

}

interface UpperCasePrintable{
	
}

class PointOne implements UpperCasePrintable{
	private int xpos, ypos;
	
	PointOne(int x, int y){
		xpos = x;
		ypos = y;
	}
	
	public String toString(){
		String posInfo = "{x pos :"+ xpos + ", y pos : "+ypos+"}";
		
		return posInfo;
	}
}

class PointTwo{
private int xpos, ypos;
	
	PointTwo(int x, int y){
		xpos = x;
		ypos = y;
	}
	
	public String toString(){
		String posInfo = "{x pos :"+ xpos + ", y pos : "+ypos+"}";
		
		return posInfo;
	}
}


class ClassPrinter{
	
	public static void print(Object obj){
		String org = obj.toString();
		
		if(obj instanceof UpperCasePrintable){
			org = org.toUpperCase();
		}
		
		System.out.println(org);
	}
}