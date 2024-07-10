
public class EncapDemo {
	public static void main(String[] args) {
		Car sonata = new Car();
		// sonata.name = "현대 소나타"; // 에러발생 private 형태로 접근 x
		// sonata.price = 30_000_000;
		sonata.setName("현대 소나타"); // 공개되지 않는 메소드를 공개된 메소드로 접근한다.
		sonata.setPrice(30_000_000); // 공개되지 않는 메소드를 공개된 메소드로 접근한다.
		// System.out.printf("이름은 %s, 가격은 %d\n", sonata.name, sonata.price);  // 기존 출력 방식은 에러
		System.out.printf("이름 = %s, 가격 = %d\n", sonata.getName(), sonata.getPrice());
	}
}
class Car {
	private String name; 
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name; // this는 자기자신 주소
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	
	// private 를 사용하려면 아래와 같이 코드가 복잡해 진다. >> 툴이 하도록 할 수 있음.	우클릭 - source - generate getter and setter
//	public void setName(String n) { // 접근 가능
//		name = n; 
//	}
//	public void setPrice(int p) { // 접근 가능
//		price = p;
//	}
//	public String getName() {
//		return name;
//	}
//	public int getPrice() {
//		return price;
}
