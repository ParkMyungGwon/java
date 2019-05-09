import java.io.*;

public class DataBufferedFilterPerformance {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		OutputStream out1 = new FileOutputStream("c:\\12.txt");
		DataOutputStream dataOut = new DataOutputStream(out1);
		// 버퍼로 가져온다.
		
		performanceTest(dataOut);
		dataOut.close();
		
		OutputStream out2 = new FileOutputStream("c:\\12.txt");
		BufferedOutputStream bufFilterOut = new BufferedOutputStream(out2, 1024*10);
		
		DataOutputStream dataBufOut = new DataOutputStream(bufFilterOut);
		
		performanceTest(dataBufOut);
		dataBufOut.close();
	}

	public static void performanceTest(DataOutputStream dataOut) throws IOException{
		long startTime  = System.currentTimeMillis();
		for(int i=0; i<10000; i++)
			for(int j=0; j<10000; j++)
				dataOut.writeDouble(12.345);
		
		dataOut.flush();
		long endTime = System.currentTimeMillis();
		System.out.println("경과 시간 : "+ (endTime-startTime));
	}
}
