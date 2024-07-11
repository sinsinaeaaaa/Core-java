
public class Car {
	private String name;
	private int price;
	
	//기본 생성자 , 컴파일러가 자동으로 만드는 부분이므로 코드로 작성하지 않아도 된다.
	public Car() {
		this.name = null;
		this.price = 0;
	};
	
	public void setName(String name) {
		this.name = name; // 앞에 있는 name 과 뒤에 있는 name 은 구분 해줘야 컴파일러가 알아들을 수있다. 앞에 있는 name은 이 클래스에 name 이므로 this.를 붙여준다.
	}
	public String getName() {
		return this.name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return this.price;
	}
	public Car clone() { // Car 복제, 주소 복사, return타입은 자기 자신이므로 Car
		return this;
	}
}
