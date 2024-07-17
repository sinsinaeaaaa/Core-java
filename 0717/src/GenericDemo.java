
public class GenericDemo {
	public static void main(String[] args) {
//		Car carnival = new Car("40_000_000");
		Car<Integer> carnival = new Car<Integer>(45000000);
		System.out.printf("price = %d\n" ,carnival.getPrice()); // T가 runtime 할때 타입을 변환시킨다.
		Car<String> matiz = new Car<String>("10000000");
		System.out.printf("price = %s\n" ,matiz.getPrice()); // T가 runtime 할때 타입을 변환시킨다.
		Car<Double> sonata = new Car<Double>(45000000.0); 
		System.out.printf("price = %.1f\n" ,sonata.getPrice()); // T가 runtime 할때 타입을 변환시킨다.
	}
}
// generic 형태를 익혀두기.
class Car<T,U,V> {
	private T price;
	private U name;
	
	public Car(T price, U name) {
		this.price = price;
		this.name = name;
	}
	
	public T getPrice() {
		return price;
	}
	public void setPrice(T price) {
		this.price = price;
	}
}