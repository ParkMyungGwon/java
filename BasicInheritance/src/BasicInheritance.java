
public class BasicInheritance {
	
	public static void main(String[] args){
		
		BusinessMan man1
		= new BusinessMan("Mr. Hong", "Hybrid 3d eld", "Staff Eng");
		
		BusinessMan man2
		= new BusinessMan("Mr. lee", "Hybrid 3d eld", "Assist Eng");
		
		System.out.println("First man info...");
		man1.tellYourName();
		man1.tellYourInfo();
		
		System.out.println("Second man info...");
		man2.tellYourInfo();
		
		
	}

}


class BusinessMan extends man{
	
	private String company;
	private String position;
	
	public BusinessMan(String name, String company, String position){
		super(name);
		this.company = company;
		this.position = position;
	}
	
	public void tellYourInfo(){
		System.out.println("My company is" + company);
		
		System.out.println("My position is " + position);
		
		tellYourName();
	}
	
}

class man{
	private String name;
	
	public man(String man) {this.name = man;}
	public void tellYourName(){ System.out.println("My name is "+ name);}
	
}