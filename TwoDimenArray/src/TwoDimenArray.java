
public class TwoDimenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int [3][4];
		
		for(int i=0; i<3;i++)
		{	
			for(int j=0; j<4 ; j++){
				arr[i][j] = i+j;
			}
		}
		
		for(int i=0; i<3;i++)
		{
			for(int j=0; j<4 ; j++){
				System.out.printf("%d", i,j,arr[i][j]);
			}
			System.out.printf("\n");

		}
	}

}
