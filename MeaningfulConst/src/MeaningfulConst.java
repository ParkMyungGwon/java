import java.util.Scanner;

interface Week{
	int MON = 1, TUE = 2, WED = 3, THU = 4, FRI = 5, SAT = 6, SUN = 7;
}

public class MeaningfulConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("오늘의 요일을 선택하시오.");
		System.out.println("1. 월, 2. 화, 3. 수, 4.목");
		System.out.println("5. 금, 6. 토, 7일");
		System.out.print("선택 : ");
		
		Scanner sc = new Scanner(System.in);
		int sel = sc.nextInt();
		
		switch(sel){
		
		case Week.MON :
			System.out.println("11");
			break;
		
		case Week.TUE :
			System.out.println("22");
			break;
			
		case Week.WED :
			System.out.println("33");
			break;
			
		case Week.THU :
			System.out.println("44");
			break;
			
		case Week.FRI :
			System.out.println("555");
			break;
			
		case Week.SAT :
			System.out.println("66");
			break;
			
		case Week.SUN :
			System.out.println("77");
			break;
		
		
		}
	}

}
