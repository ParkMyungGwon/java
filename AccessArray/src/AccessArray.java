
public class AccessArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[3];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		int sum = 0;
		for(int j=0;j <arr.length ; j++ ){
			sum +=arr[j];
			System.out.println(arr.length);

		}
		System.out.println(sum);
	}

}
