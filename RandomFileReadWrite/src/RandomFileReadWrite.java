import java.io.*;

public class RandomFileReadWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		RandomAccessFile raf = new RandomAccessFile("c:\\11.txt", "rw");
		System.out.println("Write......");
		System.out.printf("���� ����� ��ġ : %d ����Ʈ \n", raf.getFilePointer());

		raf.writeInt(200);
		raf.writeInt(500);
		System.out.printf("���� ����� ��ġ : %d ����Ʈ \n", raf.getFilePointer());
		

		raf.writeDouble(48.65);
		raf.writeDouble(52.24);
		System.out.printf("���� ����� ��ġ : %d ����Ʈ \n", raf.getFilePointer());
		
		
		
		System.out.println("read----------------");
		raf.seek(0);
		System.out.printf("���� ����� ��ġ : %d ����Ʈ \n", raf.getFilePointer());

		System.out.println(raf.readInt());
		System.out.println(raf.readInt());
		System.out.printf("���� ����� ��ġ : %d ����Ʈ \n", raf.getFilePointer());

		System.out.println(raf.readDouble());
		System.out.println(raf.readDouble());
		System.out.printf("���� ����� ��ġ : %d ����Ʈ \n", raf.getFilePointer());
		
		raf.close();
	}

}