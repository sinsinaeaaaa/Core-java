
public class ProductOutput {
	void output(Product [] array) {
			System.out.println("                             <<상품별 판매 이익금 및 이익율표>>");
			System.out.println("------------------------------------------------------------------------------------------");
			System.out.println("상품명\t수량\t판매단가\t매입단가\t운송료\t이익금\t이익률");
			System.out.println("------------------------------------------------------------------------------------------");
			for(Product p : array) {
				System.out.printf("%12s %5d %,5d %,5d %,5d %,5d %4.2f\n"
					,p.getName(), p.getQty(), p.getSalePrice(), p.getInPrice(), p.getMove(),p.getProfit(), p.getProfitRate());
			}
	}
}
