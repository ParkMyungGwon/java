import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("µÎ °³ÀÇ Á¤¼ö ÀÔ·Â : ");
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		try{
			System.out.println("³ª´°¼À °á°ú ¸ò : " + num1/num2);
			System.out.println("³ª´°¼À °á°úÀÇ ³ª¸ÓÁö : " + num1%num2);
		}catch(ArithmeticException e){
			System.out.println("³ª´°¼À ºÒ°¡");
			System.out.println(e.getMessage());
		}
		System.out.println("³¡");
	}

}
