
public class ConstructorDemo {
	public static void main(String[] args) {
//		Car sonata = new Car();
//		System.out.println(sonata.getName()); //null
//		System.out.println(sonata.getPrice()); //0
		
		//이미 명시적 생성자가 있기 때문에, 기본생성자가 없고 때문에 이 코드는 에러가 발생한다.
		//에러가 나지 않으려면 Product코드에 public Product() {}; 를 추가해줘야 함.
//		Product p = new Product(); // 에러 발생
		
		Product pencil = new Product("모나미연필",3000,"모나미사");
		Product computer = new Product("노트북",3000,"LG Gram");
		Product tv = new Product("텔레비전",30_000_000,"삼성전자");
		
	}
}
