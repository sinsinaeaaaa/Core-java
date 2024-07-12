// 4. 부모 생성자는 상속되지 않는다.
// 자식 생성자는 부모의 기본 생성자만 호출한다.
// 부모의 기본 생성자가 아닌 다른 생성자를 호출할 때는 super를 사용한다.
// super()는 자식 생성자에서 임의로 부모 생성자를 호출할 때 사용한다.
// 반드시 생성자 안에서만 사용해야 하고, 생성자 안에서 반드시 첫번째에 위치해야한다. >> this()와 super()는 같이 쓸 수 없다. 둘다 먼저 와야 되기 때문에. super()와 this.는 쓸 수 있다.

public class InheritanceDemo3 {
	public static void main(String[] args) {
		Sonata sonata = new Sonata("EF Sonata", 30_000_000);
	}
}
class Car {
	String name;
	int price;
	
	public Car(String name, int price) {
		this.name = name; this.price=price;
	}
}

class Sonata extends Car{
	int price;

	public Sonata(String name, int price) {
//		System.out.println("나는 자식의 생성자");
		super(name,price);
		this.price = price;
	}
}
