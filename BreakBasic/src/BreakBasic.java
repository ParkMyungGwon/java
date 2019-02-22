
public class BreakBasic {

	
	public static void main(String[] args){
		
		int num = 1;
		int cnt = 0;
		while(true){
			
			if(num % 2 != 0){
				cnt += num;
				System.out.println(num);
			}else if(num % 3 == 0) {
				cnt += num;
				System.out.println(num);
			}
			
			if(cnt > 1000){
				break;
			}
			
			num++;
			
			
		}
			
			System.out.println(cnt);
		}
		
	}

