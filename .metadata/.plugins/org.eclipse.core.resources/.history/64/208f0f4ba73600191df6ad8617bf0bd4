
public class FruitSalesMain2 {

	public static void main(String[] args){
		
		FruitSeller seller1= new FruitSeller();
		seller1.initMembers(0, 30, 1500);
		
		FruitSeller seller2= new FruitSeller();
		seller2.initMembers(0, 20, 1000);
		
		FruitBuyer buyer = new FruitBuyer();
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
	int APPLE_PRICE;
	
	public void initMembers(int money, int appleNum, int price){
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
	
	int numOfApple = 0;
	int myMoney = 10000;
	
	public void buyApple(FruitSeller seller, int money){
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyerResult(){
		System.out.println("구매한 사과" + numOfApple);
		System.out.println("남은돈 " + myMoney);
	}
}