import java.io.*;

public class TransientMembers {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		// 인스턴스 저장
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:\\11.txt"));
		
		PersonalInfo info = new PersonalInfo("John", "baby", 3, 43);
		info.showCirlceInfo();
		out.writeObject(info);
		out.close();
		

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("c:\\11.txt"));
		
		PersonalInfo recovInfo = (PersonalInfo)in.readObject();
		in.close();
		
		recovInfo.showCirlceInfo();
	}

}

class PersonalInfo implements Serializable{
	String name;
	transient String secretInfo;
	
	int age;
	transient int secretNum;
	
	public PersonalInfo(String name, String sInfo, int age, int sNum){
		this.name = name;
		secretInfo = sInfo;
		this.age = age;
		this.secretNum = sNum;
	}
	
	public void showCirlceInfo(){
		System.out.println("name : " + name);
		System.out.println("secretInfo : " + secretInfo);
		System.out.println("age : " + age);
		System.out.println("secretNum : " + secretNum);
		System.out.println("");
	}
}