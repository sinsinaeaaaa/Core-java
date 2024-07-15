
public class InterfaceDemo1 {
	public static void main(String[] args) {
		Car sonata = new Car("EF소나타", 30_000_000);
		Car matiz = new Car("RedMatiz", 10_000_000);
		// sonata - matiz
		int result = sonata.compareTo(matiz);
		System.out.println(result);
	}
}

class Car implements Comparable<Car> { // Comparable 인터페이스는 compareTo 메서드를 구현하도록 요구
	private String name;
	private int price;
	
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("Car [name=%s, price=%s]", name, price);
	}

	@Override
	public int compareTo(Car other) {	// compareTo를 재정의해야한다.
		return this.price - other.price;
	}
	
}