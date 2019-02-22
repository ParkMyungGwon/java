
public class FruitSalesMain2 {

	public static void main(String[] args){
		
		FruitSeller seller1= new FruitSeller(0, 30, 1500);

		
		FruitSeller seller2= new FruitSeller(0, 20, 1000);

		
		FruitBuyer buyer = new FruitBuyer(10000);
		buyer.buyApple(seller1, 4500);
		buyer.buyApple(seller2, 2000);
		
		System.out.println("과일 판매자 1의 현재상황");
		seller1.showSaleResult();
		
		System.out.println("과일 판매자 2의 현재상황");
		seller2.showSaleResult();
		
		System.out.println("과일 구매자의 현재상황");
		buyer.showBuyerResult();
	}
}


class FruitSeller{
	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;
	
	public FruitSeller(int money, int appleNum, int price){
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	
	public int saleApple(int money){
		
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		
		return num;
		
	}
	
	public void showSaleResult(){
		System.out.println("남은사과 :" + numOfApple);
		System.out.println("판매 수익 :" + myMoney);
	}
	
	
}


class FruitBuyer{
	
	int numOfApple;
	int myMoney;
	
	public FruitBuyer(int money){
		numOfApple=0;
		myMoney = money;
	}
	
	public void buyApple(FruitSeller seller, int money){
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyerResult(){
		System.out.println("구매한 사과" + numOfApple);
		System.out.println("남은돈 " + myMoney);
	}
}