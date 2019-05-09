import java.util.Random;


public class RandomNumberGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random r = new Random(12);
		
		for(int i=0; i<100; i++){
			System.out.println(r.nextInt(1000));
		}
	}
}
