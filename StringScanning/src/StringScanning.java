import java.util.Scanner;
public class StringScanning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String source = "1 5 7";
		Scanner sc = new Scanner(System.in);
		
		int num1  = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int sum = num1+ num2 + num3;
		
		System.out.printf(
				"문자열에 저장된  %d, %d, %d의 합은 %d \n", num1, num2, num3, num1 + num2 +num3);
	}

}
