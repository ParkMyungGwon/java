import java.io.*;

public class ObjectSerializable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:\\11.txt"));
		// 인스턴스 출력
		out.writeObject(new Circle(1, 1, 2.4));
		out.writeObject(new Circle(2, 2, 4.8));
		out.writeObject(new String("String implements Serializable"));
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("c:\\11.txt"));
		
		Circle cl1 = (Circle)in.readObject();
		Circle cl2 = (Circle)in.readObject();
		
		String message = (String)in.readObject();
		in.close();
		
		cl1.showCircleInfo();
		cl2.showCircleInfo();
		
		System.out.println(message);
		// 인스턴스 복원
	}

}

class Circle implements Serializable{
	int xPos;
	int yPos;
	double rad;
	
	public Circle(int x, int y, double r){
		xPos = x;
		yPos = y;
		rad = r;
		
	}
	
	public void showCircleInfo(){
		System.out.printf("[%d, %d] \n", xPos, yPos);
		System.out.println("rad"+ rad);
	}
}