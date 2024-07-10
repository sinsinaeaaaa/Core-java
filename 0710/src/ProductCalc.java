
public class ProductCalc {
	void calc(Product [] array) {
		for(Product p : array) {
			int saleAmt = p.getSalePrice() * p.getQty();
			p.setSaleAmt(saleAmt);
			
			int inAmt = p.getInPrice() * p.getQty();
			p.setInAmt(inAmt);
			
			int profit = p.getSaleAmt() - (p.getInAmt() + p.getMove());
			p.setProfit(profit);
			
			double profitRate = (double) p.getProfit() / p.getInAmt() * 100;
			p.setProfitRate(profitRate);
		}

	}
}