
public class StringClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			Person p1 = new Person("이승원", 22);
			
			Person p2 = (Person)p1.clone();
			p2.changeName("정해영");
			
			Person p3 = (Person)p2.clone();
			p3.changeName("정승주");
			
			p1.showPersonInfo();
			p2.showPersonInfo();
			p3.showPersonInfo();
			
		}catch (CloneNotSupportedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}


class Person implements Cloneable{
	
	private String name;
	private int age;
	
	public Person(String name, int age){
		
		this.name = name;
		this.age = age;
		
	}
	
	public void changeName(String name){
		this.name = name;
	}
	
	public void showPersonInfo(){
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("");
	}
	
	public Object clone() throws CloneNotSupportedException{
		Person cpy = (Person)super.clone();
		return cpy;
	}
	
}



