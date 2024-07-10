
public class ProductMgmt {
	public static void main(String[] args) throws java.io.IOException  {
		Product [] prodArray = new Product[7];
		new ProductInput().input(prodArray); // input method는 멤버 메소드. 한번만 사용할 때는 참조변수 생성 안하고 이렇게 써도 된다.
		new ProductCalc().calc(prodArray);
		new ProductOutput().output(prodArray);
	}
}
