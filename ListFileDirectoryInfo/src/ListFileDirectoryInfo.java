import java.io.File;

public class ListFileDirectoryInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File myDir = new File("MyDir");
		File[] list = myDir.listFiles();
		
		for(int i=0; i<list.length; i++){
			System.out.print(list[i].getName());
			
			if(list[i].isDirectory())
				System.out.println("\t \t DIR");
			else
				System.out.println("\t \t FILE");
		}
	}

}
