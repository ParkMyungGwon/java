import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableInstMember {


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
	Point p;
	double rad;
	
	public Circle(int x, int y, double r){
		
		p = new Point(x, y);
		rad = r;
		
	}
	
	public void showCircleInfo(){
		System.out.printf("[%d, %d] \n", p.x, p.y);
		System.out.println("rad"+ rad);
	}
}


class Point implements Serializable{
	int x, y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}
