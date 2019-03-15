package whtNeedArray;

import java.util.Scanner;

public class whtNeedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fstHighScore = 0;
		int sndHighScore = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력 : " );
		
		int score1 = sc.nextInt();
		
		if(score1 >= fstHighScore){
			
			sndHighScore = fstHighScore;
			
			fstHighScore = score1;
			
		}else if(score1 < fstHighScore && score1 > sndHighScore){
			sndHighScore = score1;
		}
		
		
		System.out.println("점수 입력 ;");
		
		int score2 = sc.nextInt();
		
		if(score2 >= fstHighScore){
			
			sndHighScore = fstHighScore;
			fstHighScore = score2;
			
			
		}else if(score2 < fstHighScore && score2 > sndHighScore){
			sndHighScore = score2;
			
		}
		

		
		System.out.println("점수 입력 ;");		
		int score3 = sc.nextInt();

		if(score3 >= fstHighScore){
			
			sndHighScore = fstHighScore;
			fstHighScore = score3;
			
			
		}else if(score3 < fstHighScore && score3 > sndHighScore){
			sndHighScore = score3;
		}
		
		System.out.printf("A 학점은 %d 점 이상입니다. \n", sndHighScore);
		
	}

}
