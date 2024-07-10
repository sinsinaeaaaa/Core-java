
public class Product {
	private String name; // Field, 속성(Attribute, property, state)
	private int qty;
	private int salePrice; // 판매단가
	private int inPrice; // 매입단가
	private int move; // 운송료
	private int saleAmt; // 판매금액 = 판매단가 * 수량
	private int inAmt; // 매입금액 = 매입단가 * 수량
	private int profit; // 이익금 =판매금액 - (매입금액 + 운송료)
	private double profitRate; // 이익률 = 이익금 / 매입금액 * 100
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}
	public int getInPrice() {
		return inPrice;
	}
	public void setInPrice(int inPrice) {
		this.inPrice = inPrice;
	}
	public int getMove() {
		return move;
	}
	public void setMove(int move) {
		this.move = move;
	}
	public int getSaleAmt() {
		return saleAmt;
	}
	public void setSaleAmt(int saleAmt) {
		this.saleAmt = saleAmt;
	}
	public int getInAmt() {
		return inAmt;
	}
	public void setInAmt(int inAmt) {
		this.inAmt = inAmt;
	}
	public int getProfit() {
		return profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
	}
	public double getProfitRate() {
		return profitRate;
	}
	public void setProfitRate(double profitRate) {
		this.profitRate = profitRate;
	}
	
}
