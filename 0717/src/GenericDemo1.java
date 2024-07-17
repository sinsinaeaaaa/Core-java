import java.util.Vector;

public class GenericDemo1 {
	public static void main(String[] args) {
		
		//주의할 점
//		Object obj = "Hello"; // String이 Object로 형변환이 된다.
//		java.util.Vector<Object> v1 = new java.util.Vector<String> (); // generic 끼리에서는 형 변환이 안된다.
		
//		Vector v1 = new Vector(); // <> 표시를 생략해도 에러가 발생하지는 않는다. 안 쓰면 raw type 이라고 한다.
		
//		Vector<String> v1 = new Vector<String> ();
//		v1.add(5);// String 에 int를 넣으려고 하면 에러
		
		Vector<?> v1 = new Vector<Integer>();
//		v1.add(5);// 
		
		Product<Integer> pencil = new Product<Integer>(1000);// Integer이 Number의 자식이라 가능함.
		Product<Double> ballpen = new Product<Double>(100.0); // Double이 Number의 자식이라 가능함.
//		Product<Object> obj = new Product<Object>(new Car()); // Object가 Number의 자식이 아니라서 에러가 발생.
		
//		Car<? extends Number> car1 = new Car<Integer>100;
		Car<? super Number> car2 = new Car<Object>(1000);
		car2.getPrice(); //Object 타입
		//super인 경우 실체형을 따라가고
		//extends인 경우에눈 선언형을 따라간다.
		//? 는 Object를 따라간다.
		
	}
}
class Product<T extends Number>{ /// T가 Number를 상속받음. < T,U> 이런 식으로 여러개 써도 된다.
	private T price;
	public Product(T price) {
		this.price = price;
		
	}
	@Override
	public String toString() {
		return String.valueOf(this.price);
	}
}
