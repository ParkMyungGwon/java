import java.util.Scanner;


public class MonDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int d = sc.nextInt();

		
		int sum = 0;
		
		if(m != 1){
			for(int i=1; i<m ;i++){
				
				switch(i){
				
				case 1 : case 3 : case 5 : case 7 :
					sum = sum + 31;
					break;
				
				case 4 : case 6 : case 9 : case 11 :
					sum = sum + 30;
					break;
					
				case 2 :
					sum = sum + 28;
					break;
				
				}
				
			}
		}
		

		
		d = d + sum;

		int titi = d / 7;
		
		int s; 
		
		if(d % 7 == 0){
			s = 7;
			
		}else {
			s = d - ( titi * 7);
			
		}

		switch(s){
		
		case 1 : 
			System.out.print("MON");
			break;
		
		case 2 : 
			System.out.print("TUE");
			break;	
		
		case 3 : 
			System.out.print("WED");
			break;
		
		case 4 : 
			System.out.print("THU");
			break;	
			
		case 5 : 
			System.out.print("FRI");
			break;
		
		case 6 : 
			System.out.print("SAT");
			break;	
		
		case 7 : 
			System.out.println("SUN");
			break;
		
		
		}
		
		
	}

}

